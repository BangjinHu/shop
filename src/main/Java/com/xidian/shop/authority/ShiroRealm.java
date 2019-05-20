package com.xidian.shop.authority;

import com.xidian.shop.entity.User;
import com.xidian.shop.service.PermissionService;
import com.xidian.shop.service.RoleService;
import com.xidian.shop.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private RoleService roleService;

    @Autowired
    private PermissionService permissionService;

    @Autowired
    private UserService userService;

    // 角色权限和对应权限添加
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 获取登录用户名
        String userName = (String)principalCollection.getPrimaryPrincipal();
        // 查询用户的角色信息
        Set<String> roles = getRolesByUsername(userName);
        // 查询角色的权限信息
        Set<String> permissions = getPermissionsByUserName(userName);
        // 设置用户的角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(roles);
        simpleAuthorizationInfo.setStringPermissions(permissions);

        return simpleAuthorizationInfo;
    }

    // 根据用户名字从数据库中获取当前用户的权限数据
    private Set<String> getPermissionsByUserName(String userName) {
        List<String> list = permissionService.queryPermissionNameByUserName(userName);
        if( list != null ){
            Set<String> sets = new HashSet<>(list);
            return sets;
        }else{
            return null;
        }
    }

    // 根据用户名字从数据库中获取当前用户的角色数据
    private Set<String> getRolesByUsername(String userName) {
        List<String> list = roleService.queryRoleNameByUserName(userName);
        if( list != null ){
            Set<String> sets = new HashSet<>(list);
            return sets;
        }else{
            return null;
        }
    }

    // 认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 1.从主体传过来的信息中获取用户名
        String userName = (String)authenticationToken.getPrincipal();
        // 2.通过用户名到数据库获取凭证
        String password = getPasswordByUserName(userName);
        if( password == null ){
            return  null;
        }
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(userName,password,"shiroRealm");
        return simpleAuthenticationInfo;
    }

    // 通过用户名从数据库中获取当前用户的密码
    private String getPasswordByUserName(String userName) {
        User user = userService.queryUserByUserName(userName);
        if( user != null ){
            return user.getPassword();
        }else{
            return null;
        }
    }
}

package com.xidian.shop.controller;

import com.xidian.shop.constant.Constant;
import com.xidian.shop.entity.Admin;
import com.xidian.shop.entity.auth.SysPermission;
import com.xidian.shop.entity.auth.SysRole;
import com.xidian.shop.entity.auth.SysUser;
import com.xidian.shop.exception.UserException;
import com.xidian.shop.service.AdminService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private static final Logger LOG = Logger.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;

    @RequestMapping("/")
    public String index(Model model, HttpSession session) throws UserException {
        String username = (String) session.getAttribute("username");
        if (username == null){
            throw new UserException("用户未登录");
        }

        Admin admin = adminService.findAdminByUserName(username);
        if (admin == null){
            throw new UserException("管理员身份未录入");
        }

        session.setAttribute("username", username);
        admin = checkAdminLogin(session);
        model.addAttribute("admin", admin);
        return "admin/index";

    }

    public Admin checkAdminLogin(HttpSession session) throws UserException {
        String username = (String) session.getAttribute("username");
        if (username == null){
            throw new UserException("管理员未登录");
        }
        Admin admin = adminService.findAdminByUserName(username);
        if (admin == null){
            throw new UserException("管理员身份信息未录入");
        }

        SysUser sysUser = adminService.findSysUserByUserName(admin.getUsername());
        Set<String> permissions = new HashSet<>();
        //查找用户的角色信息和权限信息
        for (SysRole role : sysUser.getRoles()){
            for (SysPermission permission : role.getPermissions()){
                //权限信息中添加url
                permissions.add(permission.getPurl());
            }
        }
        //添加admin的权限
        admin.setPermissions(permissions);
        return admin;
    }

    @RequestMapping("/login")
    public String login(){
        return "admin/login";
    }

    @RequestMapping("/dologin")
    public String dologin(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (password != null && password.equals("1")){
            request.getSession().setAttribute("username", username);
        }
        return "redirect:/user/user";
    }

    @RequestMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String redirectURL = Constant.CAS_LOGOUT_URL;
        response.sendRedirect(redirectURL);
    }


    @RequestMapping("/user")
    public String user(Model model, HttpSession session) throws UserException {
        Admin admin = checkAdminLogin(session);

        model.addAttribute("admin", admin);
        return "admin/user";

    }
}

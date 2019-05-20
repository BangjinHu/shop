package com.xidian.shop.controller;

import com.xidian.shop.service.PermissionService;
import com.xidian.shop.service.RoleService;
import com.xidian.shop.service.UserService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class LoginController {

    private static Logger LOG = Logger.getLogger(LoginController.class);

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/403.html")
    public String noAuth(){
        return "403";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "user/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginUser(String username, String password) {

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
        }catch (AuthenticationException e){
            LOG.info(e.getMessage());
            return "403";
        }
        return "user/login";
    }

    @RequestMapping("/main")
    public String index(){
        return "user/main";
    }
    @RequestMapping("/logOut")
    public String logOut(HttpSession session){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "user/login";
    }

}

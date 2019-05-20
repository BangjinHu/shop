package com.xidian.shop.controller;

import com.xidian.shop.constant.Constant;
import com.xidian.shop.entity.User;
import com.xidian.shop.exception.UserException;
import com.xidian.shop.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger LOG = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String info(Model model, HttpSession session) throws UserException {
        User user = checkUserLogin(session);
        model.addAttribute("user", user);

        List<User> userList = userService.findAllUsers();
        model.addAttribute("userList", userList);

        LOG.info("用户：" + userList.toString());
        return "user/main";
    }

    public User checkUserLogin(HttpSession session) throws UserException {
        Integer id = (Integer) session.getAttribute("id");
        if (id == null) {
            throw new UserException("用户未登录");
        }

        User user = userService.findUserById(id);
        if (user == null){
            throw new UserException("用户不存在");
        }

        return user;
    }

    @RequestMapping("/login")
    public String login() {
        return "user/login";
    }

    @RequestMapping("/dologin")
    public String dologin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        LOG.info("dologin" + username + password);

        if (password != null && password.equals("1")) {
            LOG.info("login success");
            request.getSession().setAttribute("username", username);
        }

        LOG.info("redirect");

        return "redirect:/user/main";
    }

    //shiro测试
//    @RequestMapping("/dologin")
//    public String dologin(User user){
//        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getPassword());
//        try {
//            subject.login(token);
//        }catch (AuthenticationException e){
//            e.printStackTrace();
//            return e.getMessage();
//        }
//        return "SUCCESS";
//    }

    @RequestMapping("/logout")
    public void logout(HttpServletResponse response) throws IOException {
        String redirectURL = Constant.CAS_LOGOUT_URL;
        response.sendRedirect(redirectURL);
    }

    /**
     * 新闻
     * @param model
     * @return
     */
    @RequestMapping("/news")
    public String news(Model model){
        List<User> users = userService.findAllUsers();
        model.addAttribute("userList", users);

        return "user/user";
    }



}

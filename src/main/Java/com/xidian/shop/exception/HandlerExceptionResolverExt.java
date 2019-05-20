package com.xidian.shop.exception;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.rmi.ServerException;


public class HandlerExceptionResolverExt implements HandlerExceptionResolver {

    private static Logger LOG = Logger.getLogger(HandlerExceptionResolverExt.class);

    private static final int USER_EXCEPTION_CODE = 1;
    private static final int SERVER_EXCEPTION_CODE = 2;
    private static final int UNKNOW_EXCEPTION_CODE = 3;

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView("error");

        if (e instanceof UserException){
            modelAndView.addObject("message", e.getMessage());
            modelAndView.addObject("code", USER_EXCEPTION_CODE);
            LOG.error("用户异常：" + e.getMessage(), e);
        }else if (e instanceof ServerException){
            modelAndView.addObject("message", e.getMessage());
            modelAndView.addObject("code", SERVER_EXCEPTION_CODE);
            LOG.error("服务器异常：" + e.getMessage(), e);
        }else {
            modelAndView.addObject("message", e.getMessage());
            modelAndView.addObject("code", UNKNOW_EXCEPTION_CODE);
            LOG.error("服务器未知异常：" + e.getMessage());
        }
        return modelAndView;
    }
}

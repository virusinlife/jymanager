package com.jymanager.interceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import com.jymanager.auth.Auth;

public class AuthInterceptor extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {

    	if(handler instanceof ResourceHttpRequestHandler ) return true;
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        Auth annotation = method.getAnnotation(Auth.class);
        if (annotation != null) {
           System.out.println("你遇到了：@Auth");
           String accessToken = request.getParameter("access_token");
           System.out.println(accessToken);
            /**
             * Do something
             */
           if(accessToken == null ) return false;
        }
        // 没有注解通过拦截
        return true;
    }

}
package com.spring.demo.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Interceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
       if(request.getRequestURI().equals("/login")) {
           String username = request.getParameter("username");
           String password = request.getParameter("password");
           if (username.equals("shivangi") && password.equals("shivangi")) {
               HttpSession session = request.getSession();
               session.setAttribute("username", username);
               session.setAttribute("password", password);
               response.sendRedirect("display.jsp");
           } else {
               response.sendRedirect("index.jsp");
           }
       }
       else if (request.getRequestURI().equals("/admin")){
           String username = request.getParameter("username");
           String password = request.getParameter("password");
           if (username.equals("abcd") && password.equals("1234")) {
               HttpSession session = request.getSession();
               session.setAttribute("username", username);
               session.setAttribute("password", password);
               response.sendRedirect("adminDisplay.jsp");
           } else {
               response.sendRedirect("index.jsp");
           }

       }
        return true;
    }

   

}

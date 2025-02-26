package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;

        /* 설명.
         *  Tomcat 10버전 이전에는 post 요청일 때는 인코딩 설정을 하지 않으면 한글이 깨지곤 했다.
         *  우리가 사용하는 것은 10버전의 Tomcat이라 굳이 해주지 않아도 동작하지만, 현업에서 경우에 따라 필요할 수도
         *  있고 추가로 다른 인코딩 설정으로 바꿀 때도 해당 방식의 필터로 바꿀 수 있다.
         * */
        if ("POST".equals(httpRequest.getMethod())) {
            httpRequest.setCharacterEncoding("UTF-8");
        }

        filterChain.doFilter(httpRequest, servletResponse);
    }
}

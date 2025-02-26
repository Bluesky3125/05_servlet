package com.ohgiraffers.section01.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/* 설명. 인스턴스 생성 순서 실험용 */
@WebFilter(filterName = "HFilter", urlPatterns = "/first/*")
//@WebFilter(filterName = "firstFilter")
public class HFilter implements Filter {

    public HFilter() {
        System.out.println("HFilter 인스턴스 생성!");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("HFilter의 init 호출!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("HFilter의 doFilter 호출!");

        /* 설명. FilterChain에서 제공하는 doFilter는 다음 필터 또는 서블릿으로 진행하라는 의미이다. */
        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("서블릿 다녀온 후 HFilter로 복귀");
    }

    @Override
    public void destroy() {
        System.out.println("HFilter의 destroy 호출!");
    }
}

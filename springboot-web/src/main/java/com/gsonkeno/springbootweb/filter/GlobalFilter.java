package com.gsonkeno.springbootweb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*", filterName = "globalFilter")
public class GlobalFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("globalFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //接收请求
        System.out.println("globalFilter doFilter begin");
        //交给其他Filter链处理
        filterChain.doFilter(servletRequest,servletResponse);
        //返回响应
        System.out.println("globalFilter doFilter end");
    }

    @Override
    public void destroy() {
        System.out.println("globalFilter destroy");
    }
}

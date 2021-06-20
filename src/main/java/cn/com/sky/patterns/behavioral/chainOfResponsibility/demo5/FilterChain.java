package cn.com.sky.patterns.behavioral.chainOfResponsibility.demo5;

/**
 * 类似于servlet的FilterChain
 */
public interface FilterChain {

    void doFilter(Request request, Response response);
}
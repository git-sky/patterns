package cn.com.sky.patterns.behavioral.chainOfResponsibility.demo5;

/**
 * 类似于servlet的Filter
 */
public interface Filter {

    void doFilter(Request request, Response response, FilterChain filterChain);
}

package cn.com.sky.patterns.behavioral.chainOfResponsibility.demo5;


public class AFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println(getClass().getCanonicalName() + " begin....");
        filterChain.doFilter(request, response);
        System.out.println(getClass().getCanonicalName() + " end....");
    }

}
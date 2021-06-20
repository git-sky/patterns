package cn.com.sky.patterns.behavioral.chainOfResponsibility.demo5;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 怎样才能把 Filter 和 FilterChain 关联起来呢？
 * 方式1：单个FilterChain持有Filter列表。
 * 方式2：一个FilterChain持有一个Filter。
 * </pre>
 */
public class Client {

    public static void main(String[] args) {

        Request request = new Request();
        Response response = new Response();

        List<Filter> filters = new ArrayList<>();
        filters.add(new AFilter());
        filters.add(new BFilter());

        //方式1
        FilterChain filterChain = new SizeFilterChain(filters);
        filterChain.doFilter(request, response);

        System.out.println("======================================");

        //方式2
        FilterChain filterChain2 = new IterFilterChain(filters);
        filterChain2.doFilter(request, response);

        System.out.println("======================================");

        //方式2
        FilterChain filterChain3 = FilterBuider.create(filters);
        filterChain3.doFilter(request, response);

    }


}
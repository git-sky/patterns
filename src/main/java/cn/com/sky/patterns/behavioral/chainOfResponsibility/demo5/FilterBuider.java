package cn.com.sky.patterns.behavioral.chainOfResponsibility.demo5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class FilterBuider {

    //过滤器组装方式2
    public static FilterChain create(List<Filter> filters) {

        FilterChain last = new FilterChain() {
            @Override
            public void doFilter(Request request, Response response) {
                //实际请求
                System.out.println("实际请求.....");
                return;
            }
        };

        List<Filter> filterList = new ArrayList<>(filters);

        for (int i = filterList.size() - 1; i >= 0; i--) {
            final Filter filter = filterList.get(i);
            final FilterChain next = last;
            last = new FilterChain() {
                @Override
                public void doFilter(Request request, Response response) {
                    filter.doFilter(request, response, next);
                }
            };
        }

        return last;
    }
}
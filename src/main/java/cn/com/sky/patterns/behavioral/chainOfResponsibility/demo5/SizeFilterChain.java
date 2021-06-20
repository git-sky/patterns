package cn.com.sky.patterns.behavioral.chainOfResponsibility.demo5;

import java.util.List;

/**
 * <pre>
 * 怎样才能把 Filter 和 FilterChain 关联起来呢？
 * 1、FilterChain持有Filter列表。
 *
 * </pre>
 */
public class SizeFilterChain implements FilterChain {

    private final List<Filter> filters;

    private int currentPosition = 0;

    public SizeFilterChain(List<Filter> filters) {
        this.filters = filters;
    }

    @Override
    public void doFilter(Request request, Response response) {
        if (this.currentPosition == this.filters.size()) {
            //实际请求
            System.out.println("实际请求.....");
            return;
        } else {
            this.currentPosition++;
            Filter nextFilter = this.filters.get(this.currentPosition - 1);
            nextFilter.doFilter(request, response, this);
        }
    }
}
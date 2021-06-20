package cn.com.sky.patterns.behavioral.chainOfResponsibility.demo5;

import java.util.Iterator;
import java.util.List;

/**
 * <pre>
 * 把 Filter 和 FilterChain 关联
 *
 * </pre>
 */
public class IterFilterChain implements FilterChain {

    private final List<Filter> filters;

    private Iterator<Filter> iterator;

    private int currentPosition = 0;

    public IterFilterChain(List<Filter> filters) {
        this.filters = filters;
    }

    @Override
    public void doFilter(Request request, Response response) {

        if (this.iterator == null) {
            this.iterator = this.filters.iterator();
        }

        if (this.iterator.hasNext()) {
            Filter nextFilter = this.iterator.next();
            nextFilter.doFilter(request, response, this);
            return;
        }

        //实际请求
        System.out.println("实际请求.....");
    }
}
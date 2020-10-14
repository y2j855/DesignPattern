package com.tony.dp.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/24 22:37
 * Description:
 */
public class FilterChain implements Filter{
    private List<Filter> filters=new ArrayList<Filter>();

    /**
     * 用index来记录过滤器链执行到哪一个过滤器
     */
    int index;

    public FilterChain addFilter(Filter filter){
        filters.add(filter);
        return this;
    }
    @Override
    public void doFilter(Request rq, Response rs,FilterChain chain) {
        // 在doFilter中完成，调用过滤器链中的下一个过滤器
        if(index==filters.size()) {
            return;
        }
        Filter fl=filters.get(index);
        index++;
        fl.doFilter(rq, rs, chain);
    }
}

package com.tony.dp.chain;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/24 22:36
 * Description:
 */
public interface Filter {
    /**
     * 既可以处理Request的过滤，又可以实现Response过滤
     * 最后处理完的信息都会保存在Response对象里,Response对象应该是根据Request处理结果得到的
     * 先处理完成请求，再得到响应，对象返回
     * @param rq
     * @param rs
     * @param fc
     */
    public void doFilter(Request rq,Response rs,FilterChain fc);
}

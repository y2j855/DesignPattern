package com.tony.dp.chain;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/24 22:40
 * Description:
 * request HtmlFilter --> MinganFilter
 * response MinganFilter --> HtmlFilter
 * 实现了双项责任链，通过递归来实现的
 */
public class Main {
    public static void main(String[] args) {
        Request rq=new Request();
        rq.setRequestStr("李芬是个大胖子!超级大3-8");
        Response rs=new Response();
        rs.setRequestStr("response:");

        FilterChain fc=new FilterChain();
        fc.addFilter(new HtmlFilter())
                .addFilter(new MinganFilter());

        fc.doFilter(rq, rs,fc);
        System.out.println(rq.getRequestStr());
        System.out.println(rs.getResponseStr());
    }
}

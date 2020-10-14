package com.tony.dp.chain;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/24 22:38
 * Description:
 */
public class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request rq, Response rs, FilterChain chain) {
        System.out.print("HtmlFilter--");
        rq.requestStr=rq.requestStr.replace("胖子", "**");
        //让FilterChain马上去调用下一个Filter
        chain.doFilter(rq, rs, chain);
        //处理response对象
        rs.responseStr+="HtmlFilter--";
    }
}

class MinganFilter implements Filter {

    @Override
    public void doFilter(Request rq, Response rs, FilterChain chain) {
        // TODO Auto-generated method stub
        System.out.print("AAAminganFilter--");
        rq.requestStr=rq.requestStr.replace("3-8", "??");
        chain.doFilter(rq, rs, chain);
        rs.responseStr+="MinganFilter--";
    }
}

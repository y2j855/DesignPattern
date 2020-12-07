package com.tony.dp.chain.servlet.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/7 12:06
 * Description:
 * 实现servlet filter拦截功能，request从左到右，response从右到左。
 * 核心逻辑
 * 让每一个filter，调动责任链，从而指向下一个filter，直到最后一个filter开始处理response里的内容。
 * 这样实现了先进后出，栈功能。
 */
public class Servlet_Main {

    public static void main(String[] args) {
        Request rs = new Request();
        rs.str = "大家好:)，<script>，欢迎访问 mashibing.com ，大家都是996 ";
        Response re = new Response();
        re.str = "";

        FilterChain chain = new FilterChain();
        chain.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());
        chain.doFilter(rs,re,chain);
        System.out.println(rs.str);
        System.out.println(re.str);
    }

}

interface Filter{
    public boolean doFilter(Request resquest,Response response,FilterChain chain);
}

class FilterChain implements Filter{

    List<Filter> filters = new ArrayList<Filter>();
    int index = 0;

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        if(index == filters.size()){
            return false;
        }
        Filter filter = filters.get(index);
        index++;
        return filter.doFilter(request,response,chain);
    }
}

class HTMLFilter implements Filter{

    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.str = request.str.replaceAll("<", "[").replaceAll(">", "]") + "HTMLFilter()";
        chain.doFilter(request,response,chain);
        response.str  += "--HTMLFilter()";
        return true;
    }
}

class SensitiveFilter implements Filter{

    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.str = request.str.replaceAll("996", "955") + " SensitiveFilter()";
        chain.doFilter(request,response,chain);
        response.str += "--SensitiveFilter()";
        return true;
    }
}

class Response {
    public String str;
}

class Request {
    public String str;
}


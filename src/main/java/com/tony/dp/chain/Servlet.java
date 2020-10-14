package com.tony.dp.chain;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/24 22:35
 * Description:
 */
public class Servlet {
}

//Reuqest

class Request {
    String requestStr;

    public void setRequestStr(String requestStr) {
        this.requestStr = requestStr;
    }

    public String getRequestStr() {
        return this.requestStr;
    }
}

//Response
class Response {
    String responseStr;

    public void setRequestStr(String responseStr) {
        this.responseStr = responseStr;
    }

    public String getResponseStr() {
        return this.responseStr;
    }
}

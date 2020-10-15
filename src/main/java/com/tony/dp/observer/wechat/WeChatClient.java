package com.tony.dp.observer.wechat;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/15 11:43
 * Description: 具体观察者
 * 微信客户端，实现接收的方法
 */
public class WeChatClient implements Subscriber{
    private String username;

    public WeChatClient(String username) {
        this.username = username;
    }

    @Override
    public int receive(String publisher, String articleName) {
        System.out.println(String.format("用户<%s> 接收到 <%s>微信公众号 的推送，文章标题为 <%s>", username, publisher, articleName));
        return 0;
    }
}

package com.tony.dp.observer.wechat;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/15 11:50
 * Description: 具体目标，具体被观察者
 * 微信公众号类，提供了发布文章功能。
 * 当发布文章时，调用父类的通知所有订阅者方法
 */
public class WebChatAccounts extends Publisher{
    private String name;

    public WebChatAccounts(String name) {
        this.name = name;
    }

    public void publishArticles(String articleName,String content){
        System.out.println(String.format("\n<%s>微信公众号 发布了一篇推送，文章名称为 <%s>，内容为 <%s> ", this.name, articleName, content));
        setPubStatus();
        notifySubscribers(this.name,articleName);
    }
}

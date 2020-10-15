package com.tony.dp.observer.wechat;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/15 11:52
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        WebChatAccounts accounts = new WebChatAccounts("小旋蜂");

        WeChatClient client1 = new WeChatClient("张三");
        WeChatClient client2 = new WeChatClient("李四");
        WeChatClient client3 = new WeChatClient("王五");

        accounts.subscribe(client1);
        accounts.subscribe(client2);
        accounts.subscribe(client3);

        accounts.publishArticles("设计模式 | 观察者模式及典型应用", "观察者模式的内容...");

        accounts.unSubsribe(client1);
        accounts.publishArticles("设计模式 | 单例模式及典型应用", "单例模式的内容....");
    }
}

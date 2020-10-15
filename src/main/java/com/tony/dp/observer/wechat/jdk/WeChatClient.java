package com.tony.dp.observer.wechat.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/15 14:41
 * Description:
 * 观察者
 */
public class WeChatClient implements Observer {
    private String username;

    public WeChatClient(String username) {
        this.username = username;
    }

    @Override
    public void update(Observable o, Object arg) {
        WeChatNotice notice = (WeChatNotice)arg;
        System.out.println(String.format("用户<%s> 接收到 <%s>微信公众号 的推送，文章标题为 <%s>", username, notice.getPublisher(), notice.getArticleName()));
    }
}

/**
 * 目标类
 */
class WeChatAccounts extends Observable{
    private String name;

    public WeChatAccounts(String name) {
        this.name = name;
    }

    public void publishArticles(String articleName, String content) {
        System.out.println(String.format("\n<%s>微信公众号 发布了一篇推送，文章名称为 <%s>，内容为 <%s> ", this.name, articleName, content));
        setChanged();
        notifyObservers(new WeChatNotice(this.name, articleName));
    }
}

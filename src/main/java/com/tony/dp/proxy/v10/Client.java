package com.tony.dp.proxy.v10;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/19 12:29
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        LogHandler handler = new LogHandler();
        UserManager manager = (UserManager) handler.newProxyInstance(new UserManagerImpl());
        manager.addUser("111","张三");
    }
}

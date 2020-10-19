package com.tony.dp.proxy.v10;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/19 12:22
 * Description:
 */
public class UserManagerImpl implements UserManager{
    @Override
    public void addUser(String userId, String userName) {
        System.out.println("UserManagerImpl.addUser");
    }

    @Override
    public void editUser(String userId) {
        System.out.println("UserManagerImpl.editUser");
    }

    @Override
    public String findUser(String userId) {
        System.out.println("UserManagerImpl.findUser");
        return "张三";
    }

    @Override
    public void modifyUser(String userId) {
        System.out.println("UserManagerImpl.modifyUser");
    }
}

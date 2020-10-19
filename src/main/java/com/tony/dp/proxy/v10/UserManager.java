package com.tony.dp.proxy.v10;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/19 12:20
 * Description:
 */
public interface UserManager {
    public void addUser(String userId,String userName);
    public void editUser(String userId);
    public String findUser(String userId);
    public void modifyUser(String userId);
    

}

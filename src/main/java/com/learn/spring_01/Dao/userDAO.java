package com.learn.spring_01.Dao;
import com.learn.spring_01.Model.User;

/**
 * Created by zhangmeng on 2016/1/8.
 */
public interface userDAO {
    public User getUser(User user);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int UserId);

}

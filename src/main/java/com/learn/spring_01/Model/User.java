package com.learn.spring_01.Model;

/**
 * Created by zhangmeng on 2016/1/8.
 */
public class User {
    private int id;
    private String username;
    private String password;
    public User(){}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String toString(){
        return "User[id="+id+" , username="+username+" , password="+password+"]";
    }


}
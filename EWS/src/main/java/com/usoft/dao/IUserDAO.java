package com.usoft.dao;

public interface IUserDAO {
    String login(String uname,String upwd);
    boolean register(String uname,String upwd,String email);
}

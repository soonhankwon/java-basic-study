package com.soon.dao;

public class UserInfo {

    private static int sequence = 999;

    private String userId;
    private String password;
    private String userName;


    public UserInfo(String password, String userName) {
        this.userId = String.valueOf(++sequence);
        this.password = password;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}

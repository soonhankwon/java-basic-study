package com.soon.dao;

public class UserInfoMySqlDao implements UserInfoDao{

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("UserInfoMySqlDao.insertUserInfo");
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("UserInfoMySqlDao.updateUserInfo");
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("UserInfoMySqlDao.deleteUserInfo");
    }
}

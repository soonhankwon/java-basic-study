package com.soon.dao;

public class UserInfoOracleDao implements UserInfoDao{

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("UserInfoOracleDao.insertUserInfo");
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("UserInfoOracleDao.updateUserInfo");
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("UserInfoOracleDao.deleteUserInfo");
    }
}

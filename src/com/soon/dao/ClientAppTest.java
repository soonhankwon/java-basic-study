package com.soon.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ClientAppTest {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbtype = prop.getProperty("DBTYPE");
        UserInfo userInfo = new UserInfo("password", "soon");
        UserInfoDao userInfoDao = null;

        if(dbtype.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if (dbtype.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        } else {
            System.out.println("not support");
        }

        if(userInfoDao != null) {
            userInfoDao.insertUserInfo(userInfo);
            userInfoDao.updateUserInfo(userInfo);
            userInfoDao.deleteUserInfo(userInfo);
        }

        System.out.println(userInfo);
    }
}

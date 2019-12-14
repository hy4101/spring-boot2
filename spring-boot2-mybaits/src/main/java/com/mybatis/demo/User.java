package com.mybatis.demo;

/**
 * 〈功能概述〉<br>
 *
 * @className: User
 * @package: com.mybatis.demo
 * @author: admin
 * @date: 2019/12/14 14:14
 */
public class User {

    private String id;

    private String name;

    private int userType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", userType=" + userType +
                '}';
    }
}
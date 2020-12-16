package com.gdpph.o1kuaixue.demo.chapter15.section1.section2;

public class User{
    private static String USER_ID = getUserId();
    public User(String id){
        this.USER_ID = id;
    }
    private static String getUserId() {
        throw new RuntimeException("无法找到UserId");
    }
}

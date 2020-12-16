package com.gdpph.o1kuaixue.demo.chapter18.section2.section2;

import java.sql.DriverManager;
/**
 * 连接MySQL数据库
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "121121121");
        DriverManager.println("连接数据库成功");
    }
}

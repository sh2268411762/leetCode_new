package com.gdpph.o1kuaixue.demo.chapter18.section2.section3;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * 连接MySQL数据库，获取Connection对象
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "121121121");
        System.out.println("获取客户端信息为：" + connection.getClientInfo().toString());
        System.out.println("连接数据库Connection对象为：" + connection.toString());
    }
}

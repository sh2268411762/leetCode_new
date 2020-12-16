package com.gdpph.o1kuaixue.demo.chapter18.section2.section6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "121121121");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user");
        while(resultSet.next()) {
            System.out.println("数据库读取id："+resultSet.getString("id"));
            System.out.println("数据库读取name："+resultSet.getString("name"));
            System.out.println("数据库读取phone："+resultSet.getString("phone"));
            System.out.println("数据库读取age："+resultSet.getString("age"));
        }
    }
}

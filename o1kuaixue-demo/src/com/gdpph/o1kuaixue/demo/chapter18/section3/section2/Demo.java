package com.gdpph.o1kuaixue.demo.chapter18.section3.section2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "121121121");
        String sql = "insert into user (`name`, `phone`, `age`) values (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "Peter");
        statement.setString(2, "13888888888");
        statement.setInt(3, 22);
        System.out.println("要插入user表数据为：");
        System.out.println(statement.toString());
        statement.executeUpdate();
        statement.setString(1, "Alex");
        statement.setString(2, "15000000000");
        statement.setInt(3, 30);
        statement.executeUpdate();
        System.out.println("数据表user插入数据成功！");
        statement.close();
        connection.close();
    }
}

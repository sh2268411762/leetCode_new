package com.gdpph.o1kuaixue.demo.chapter18.section3.section3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "121121121");
        String sql = "insert into user (`name`, `phone`, `age`) values (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, "Brenda");
        statement.setString(2, "13000000000");
        statement.setInt(3, 18);
        System.out.println("要插入user表数据为：");
        System.out.println(statement.toString());
        statement.executeUpdate();
        System.out.println("数据插入成功！");
        ResultSet generatedIds = statement.getGeneratedKeys();
        while (generatedIds.next()) {
            System.out.println("系统自动生成ID为：" + generatedIds.getLong(1));
        }
        statement.close();
        connection.close();
    }
}

package com.gdpph.o1kuaixue.demo.chapter18.section5.section1;

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
        connection.setAutoCommit(false);
        String sql = "insert into user (`name`, `phone`, `age`) values ";
        Statement statement = connection.createStatement();
        statement.addBatch(sql + "('Mary','021-00000000',20)");
        System.out.println("要插入user表数据为：");
        System.out.println(sql + "('Mary','021-00000000',20)");
        statement.addBatch(sql + "('Bob','010-00000000',21)");
        System.out.println("要插入user表数据为：");
        System.out.println(sql + "('Bob','010-00000000',21)");
        statement.executeBatch();
        connection.commit();
        System.out.println("数据插入成功！");
        ResultSet generatedIds = statement.getGeneratedKeys();
        while (generatedIds.next()) {
            System.out.println("系统自动生成ID为：" + generatedIds.getLong(1));
        }
        statement.close();
        connection.close();
    }
}

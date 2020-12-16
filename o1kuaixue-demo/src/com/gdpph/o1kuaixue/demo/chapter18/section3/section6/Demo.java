package com.gdpph.o1kuaixue.demo.chapter18.section3.section6;

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
        Statement queryStatement = connection.createStatement();
        ResultSet resultSet = queryStatement.executeQuery("select * from user");
        System.out.println("查询数据表user中全部数据：");
        while (resultSet.next()) {
            System.out.println("id:" + resultSet.getString("id") + "| name:" + resultSet.getString("name") + "| age:"
                    + resultSet.getString("age"));
        }
        String sql = "delete from user where name = ?"; //删除指定名字为Peter的数据
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "Peter");
        int count = statement.executeUpdate();
        System.out.println("数据变更成功，共删除记录数量为：" + count);
        System.out.println("变更完数据表中全部为：");
        resultSet = queryStatement.executeQuery("select * from user");
        while (resultSet.next()) {
            System.out.println("id:" + resultSet.getString("id") + "| name:" + resultSet.getString("name") + "| age:"
                    + resultSet.getString("age"));
        }
        statement.close();
        connection.close();
    }
}

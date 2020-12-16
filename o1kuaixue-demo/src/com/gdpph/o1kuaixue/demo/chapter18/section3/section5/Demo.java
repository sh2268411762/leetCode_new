package com.gdpph.o1kuaixue.demo.chapter18.section3.section5;

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
        ResultSet resultSet = queryStatement.executeQuery("select * from user where id = 5");
        while (resultSet.next()) {
            System.out.println("id:" + resultSet.getString("id") + "| name:" + resultSet.getString("name") + "| age:"
                    + resultSet.getString("age"));
        }
        String sql = "update user set age = 1, name = '修改名称' where id = 5"; //变更指定ID=5数据
        PreparedStatement statement = connection.prepareStatement(sql);
        int count = statement.executeUpdate();
        System.out.println("数据变更成功，共修改记录数量为：" + count);
        System.out.println("变更完数据为：");
        resultSet = queryStatement.executeQuery("select * from user where id = 5");
        while (resultSet.next()) {
            System.out.println("id:" + resultSet.getString("id") + "| name:" + resultSet.getString("name") + "| age:"
                    + resultSet.getString("age"));
        }
        statement.close();
        connection.close();
    }
}

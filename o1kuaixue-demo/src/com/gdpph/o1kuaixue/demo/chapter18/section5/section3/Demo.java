package com.gdpph.o1kuaixue.demo.chapter18.section5.section3;

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
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "121121121");
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            System.out.println("数据表user目前记录为：");
            resultSet = statement.executeQuery("select * from user");
            connection.commit();
            while (resultSet.next()) {
                System.out.println("id:" + resultSet.getString("id") + "| name:" + resultSet.getString("name")
                        + "| age:" + resultSet.getString("age"));
            }
            String sql = "insert into user (`name`, `phone`, `age`) values ";
            statement.addBatch(sql + "('Peter','021-00000000',29)");
            System.out.println("要插入user表数据为：");
            System.out.println(sql + "('Peter','021-00000000',29)");
            statement.addBatch(sql + "'Bob','010-00000000',21)"); // Bob前面少了(, 这里发生异常触发事务回滚
            System.out.println("要插入user表数据为：");
            System.out.println(sql + "('Bob','010-00000000',21)");
            statement.executeBatch();
            connection.commit();
            System.out.println("数据插入成功！");
            ResultSet generatedIds = statement.getGeneratedKeys();
            while (generatedIds.next()) {
                System.out.println("系统自动生成ID为：" + generatedIds.getLong(1));
            }
        } catch (Exception e) {
            System.out.println("发生异常进行回滚：" + e.getMessage());
            connection.rollback();
        }
        resultSet = statement.executeQuery("select * from user");
        connection.commit();
        while (resultSet.next()) {
            System.out.println("id:" + resultSet.getString("id") + "| name:" + resultSet.getString("name") + "| age:"
                    + resultSet.getString("age"));
        }
        statement.close();
        connection.close();
    }
}

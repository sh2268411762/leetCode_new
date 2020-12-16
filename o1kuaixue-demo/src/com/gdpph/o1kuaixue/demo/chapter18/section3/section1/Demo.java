package com.gdpph.o1kuaixue.demo.chapter18.section3.section1;

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
        String sql = "CREATE TABLE `user` (`id` int(11) NOT NULL AUTO_INCREMENT,`name` varchar(45) DEFAULT NULL,`phone` varchar(45) DEFAULT NULL,`age` int(8) DEFAULT NULL,PRIMARY KEY (`id`)) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8";
        System.out.println("要创建user表sql语句为：");
        System.out.println(sql);
        statement.executeUpdate(sql);
        statement.close();
        connection.close();
        System.out.println("数据表user创建成功！");
    }
}

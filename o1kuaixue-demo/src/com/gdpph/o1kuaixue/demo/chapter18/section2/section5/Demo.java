package com.gdpph.o1kuaixue.demo.chapter18.section2.section5;

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
        PreparedStatement statement = connection.prepareStatement("select * from user where name = ?");
        statement.setString(1, "Peter");
    }
}

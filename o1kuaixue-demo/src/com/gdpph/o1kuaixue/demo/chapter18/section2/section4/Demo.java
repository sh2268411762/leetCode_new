package com.gdpph.o1kuaixue.demo.chapter18.section2.section4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "121121121");
        Statement statement = connection.createStatement();
        statement.execute("select * from user");
    }
}

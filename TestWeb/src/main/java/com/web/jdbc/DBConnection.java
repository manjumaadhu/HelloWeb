package com.web.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connection URL username and password
        Connection connection= DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6641926","sql6641926", "pG7bX7JQLi");
        return connection;
    }
}

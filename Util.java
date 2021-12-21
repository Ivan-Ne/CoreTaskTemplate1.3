package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД

    private static String url = "jdbc:mysql://localhost:3306/world";
    private static String userName = "sql_user_info";
    private static String password = "99dbci!A99";

    public static Connection getConnection() {
        //try {
        //    Class.forName("com.mysql.cj.jdbc.Driver");
        //} catch (ClassNotFoundException e) {
        //    e.printStackTrace();
        //}
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
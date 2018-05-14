package ru.geekbrains.pattern.dz7;

import java.sql.*;

public class Model {

    {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static synchronized ResultSet getData() {

        ResultSet rs = null;
        try {

            Connection connection = DriverManager.getConnection("jdbc:sqlite:Results.db");
            Statement statement = connection.createStatement();
            rs = statement.executeQuery("SELECT * FROM Results");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

}

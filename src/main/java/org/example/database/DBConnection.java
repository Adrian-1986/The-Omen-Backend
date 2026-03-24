package org.example.database;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// Provides a single place to manage database connections.
public class DBConnection {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/videoclub?useSSL=false&serverTimezone=UTC";
        String user = "";
        String password = "";

        Properties props = new Properties();
        try (InputStream input = DBConnection.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (input != null) {
                props.load(input);
                user = props.getProperty("db.user", "");
                password = props.getProperty("db.password", "");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Intentando conectar a: " + url);
            System.out.println("Usuario: " + user);
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database connection successful.");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

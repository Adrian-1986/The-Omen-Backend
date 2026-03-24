package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Provides a single place to manage database connections.
public class DBConnection {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/videoclub?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "s1expres"; // <-- importante

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

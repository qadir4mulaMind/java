package config;

import java.sql.*;

public class DbConfig {
    private static final String URL="jdbc:mysql://localhost:3306/grage";
    private static final String USER="root";
    private static final String PASS="MacUser@2026#Secure";
    public static Connection getConnction() throws SQLException {
        return DriverManager.getConnection(URL, USER,PASS);
    }
}

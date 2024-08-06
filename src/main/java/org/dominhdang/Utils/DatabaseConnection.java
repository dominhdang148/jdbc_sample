package org.dominhdang.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "dominhdang2002";

    public static Connection getConnection(){
       try{
           final String SERVER_URL = "jdbc:postgresql://localhost/postgres";
           Properties props = new Properties();
           props.setProperty("user", USERNAME);
           props.setProperty("password",PASSWORD);
           return DriverManager.getConnection(SERVER_URL, props);
       } catch(SQLException e) {
           System.out.printf("There is error while connecting to database: %s \n", e);
           return null;
       }
    }
    public static Connection getConnection(String dbName){
        try{
            final String SERVER_URL = String.format("jdbc:postgresql://localhost/%s", dbName);
            Properties props = new Properties();
            props.setProperty("user", USERNAME);
            props.setProperty("password",PASSWORD);
            return DriverManager.getConnection(SERVER_URL, props);
        } catch(SQLException e) {
            System.out.printf("There is error while connecting to database: %s \n", e);
            return null;
        }
    }
}

package org.dominhdang.DAO;

import org.dominhdang.Utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SystemDAO {

    /*
     * Create new database named dbName
     **/
    public static void createDatabase(String dbName) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            if (connection != null) {
                Statement statement = connection.createStatement();
                String query = String.format("CREATE DATABASE %s", dbName);
                statement.executeUpdate(query);
            }
        } catch (SQLException e) {
            System.err.printf("There is error while creating database: %s \n", e);
        }
    }

    /*
     * Delete entire the dababase if the database is exist
     **/
    public static void dropDatabase(String dbName) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            if (connection != null) {
                Statement statement = connection.createStatement();
                String query = String.format("DROP DATABASE IF EXISTS %s", dbName);
                statement.executeUpdate(query);
            }
        } catch (SQLException e) {
            System.err.printf("There is error while dropping database: %s \n", e);
        }
    }
}

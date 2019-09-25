package com.company.SOLID.SingleResponsibility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionManager {

    private Connection conn;

   private static DataBaseConnectionManager connectionInstance = new DataBaseConnectionManager();


    public DataBaseConnectionManager() {
    }

    public void connect() throws SQLException {
        conn  = DriverManager.getConnection("some/database/url");
        System.out.println("Established Database Connection...");
    }
    public void disconnect() {
        System.out.println("connection has been disconnected");
    }

    public Connection getConn() {
        return conn;
    }

    public static DataBaseConnectionManager getManagerInstance () {

        return connectionInstance;
    }
}

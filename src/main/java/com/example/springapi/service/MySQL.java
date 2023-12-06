package com.example.springapi.service;
import javax.naming.Name;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQL {
    public static final String driver = "com.mysql.jdbc.Driver";
    private String url;
    private String username;
    private String password;
    private Connection conn;

    /**
     * Prepares the things for the connection.
     * @param hostname
     * @param database
     * @param port
     * @param username
     * @param password
     */
    public MySQL(String hostname, String database, String port, String username, String password) {
        this.username = username;
        this.password = password;

        this.url = String.format("jdbc:mysql://%s:%s/%s", hostname, port, database);
    }

    public Connection connect() throws ClassNotFoundException, SQLException {

        Class.forName(MySQL.driver);
        conn = DriverManager.getConnection(url, username, password);

        return conn;
    }


}
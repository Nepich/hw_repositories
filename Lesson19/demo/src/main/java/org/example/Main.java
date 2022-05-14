package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:src\\main\\DB\\new_db.db");
            Statement stmt = con.createStatement();
            String query = "CREATE TABLE names (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT);";
            stmt.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hello world!");
    }
}
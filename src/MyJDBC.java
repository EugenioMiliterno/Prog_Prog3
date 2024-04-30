package com.example.progetto;

import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://database-1.cfcoik2qycvy.eu-north-1.rds.amazonaws.com:3306/restaurant", "root", "56265626");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM menus");


            while (resultSet.next()) {
                System.out.println("..//assets/images/" + resultSet.getString("menu_image"));
                System.out.println(resultSet.getString("menu_name"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

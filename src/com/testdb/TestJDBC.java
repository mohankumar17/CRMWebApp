package com.testdb;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String args[]){

        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
        String user = "springstudent";
        String pass = "Springstudent@123";

        try{
            System.out.println("Connecting to the database: "+jdbcUrl);

            Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
            System.out.println("Connection Successful");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

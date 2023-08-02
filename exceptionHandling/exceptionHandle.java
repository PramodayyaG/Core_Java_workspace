package org.exceptionHandling;

import com.mysql.cj.jdbc.exceptions.CommunicationsException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class exceptionHandle {

    public static void calldbconnection(){
        try{
            String url="jdbc:mysql://localhost:3306/JDBC_conntect";
            Class.forName("com.mysql.cj.jdbc.Driver");
            //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn = DriverManager.getConnection(url,"root", "");
        }
        catch (ClassNotFoundException e){
            System.out.println("Driver not found");
        }
        catch (SQLException e) {
            System.err.println("Connection lost...!");
        }
    }
    public static void main(String[] args)  {


        calldbconnection();
        System.out.println(divide(2, 1));

    }

    public static double divide(double a, int b) {
        try {
            return (a / b);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by 0)");
            return  -1;
        }
    }
}

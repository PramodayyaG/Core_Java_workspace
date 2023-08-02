package org.JDBConnection;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hi");
        /*int a=256;
        System.out.println(a);
        byte b = (byte) a;
        System.out.println(b);*/

        //BBallPlayer bb = new BBallPlayer();
        //bb.freethrow();
        BBallPlayer[] bb1 = new BBallPlayer[3];
        Scanner sc = new Scanner(System.in);
        /*for (int i = 0; i < 2; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            String nickname = sc.next();
            int year = sc.nextInt();
            double throwpercen = sc.nextDouble();
            int gamesplayed = sc.nextInt();
            bb1[i] = new BBallPlayer(name, age, nickname, year, throwpercen, gamesplayed);

        }
        for (int i = 0; i < 2; i++) {
            System.out.println(bb1[i]);
        }*/
        String url="jdbc:mysql://localhost:3306/JDBC_conntect";
        String uname="root";
        String pass="";
        String query = "select * from students";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("Passed");
            Connection con=DriverManager.getConnection(url,uname, pass);
            Statement st = con.createStatement();
            st.executeQuery(query);
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name = rs.getNString(1);
            int age  = rs.getInt(2);
            String year = rs.getNString(3);
                System.out.println(name);
                System.out.println(age);
                System.out.println(year);

            st.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver not found");
        } catch (SQLException e) {
            throw new RuntimeException("Connect lost");
        }
    }
}
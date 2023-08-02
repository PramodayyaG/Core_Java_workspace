package org.example;

import org.Intermediate.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DataTypes dt = new DataTypes();
        //System.out.println("Number: " + dt.number.toUpperCase());
        operators opt = new operators();
        if (dt.name.toUpperCase().equals("PRAMOD")) {
            System.out.println("Name is correct");
        }
        Inter in = new Inter(10, 20);
        System.out.println(in.Return());
        in.addition(50, 20);

    }
}
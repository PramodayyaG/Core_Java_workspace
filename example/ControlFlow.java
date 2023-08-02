package org.example;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {

        System.out.println("Who is named as the father of the light bulb");
        System.out.println("A: Nikola   B: Marie    C: Edison   D: Robert");
        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
        if (ans.toLowerCase().equals("edison")){
            System.out.println("green");
        }
        else {
            System.out.println("red");
        }
    }
}


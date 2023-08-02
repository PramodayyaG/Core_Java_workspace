package org.CassinoGame;

import java.rmi.ServerError;
import java.util.Scanner;

public class inputOutput {

    public static void main(String[] args) {
        Scanner usrInput = new Scanner(System.in);
        System.out.print("Write ur name here : ");
        //String name=usrInput.nextLine();
        //System.out.println("Your name is: "+name);
        while (!usrInput.hasNext("Pramod") && !usrInput.hasNext("Pooja")){
            System.err.println("Invalid Input, Please try again...!");
            System.out.println();
            System.out.print("Write ur name here : ");
            usrInput.nextLine();
        }
    }
}

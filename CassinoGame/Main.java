package org.CassinoGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public String papper;
    public String rock;
    public String scissor;
    
    public static String gereratemove(){
        Random move = new Random();

        switch (move.nextInt(0,3)){
            case 0:
            default: return "rock";
            case 1:
                return "paper";
            case 2: 
                return "scissor";
        }
    }

    public static boolean isValidInput(String ans){
        return ans.equalsIgnoreCase("rock") || ans.equalsIgnoreCase("paper") || ans.equalsIgnoreCase("scissor");
    }
    public static boolean result(String move, String ans){
        return (move.equals("rock") && ans.equals("paper") || move.equals("paper") && ans.equals("scissor") || move.equals("scissor") && ans.equals("rock"));
    }
    
    public static void main(String[] args) {
        System.out.println("Starting Game...");
        while(true) {
            System.out.println("Rock    Paper   Scissor");
            System.out.println("Pick your move");
            Scanner sc = new Scanner(System.in);
            String ans = sc.next();
            ans=ans.toLowerCase();
            if (isValidInput(ans)) {
                String move= gereratemove();
                System.out.println("Your opponent's move: "+ move);
                if(move.equals(ans)){
                    System.out.println("It's a tie");
                }else if (result(move, ans)){
                    System.out.println("You won");
                }else System.out.println("You lost");
            }
            else if(ans.equalsIgnoreCase("quit")){break;}
            else System.out.println("Please Enter correct move");

        }
        
    }
}

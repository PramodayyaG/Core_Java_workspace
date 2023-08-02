package org.Intermediate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hi");
        /*int a=256;
        System.out.println(a);
        byte b = (byte) a;
        System.out.println(b);*/

        BasketBallPlayer bb = new BasketBallPlayer();
        //bb.freethrow();
        BasketBallPlayer[] bb1 = new BasketBallPlayer[3];
        Scanner sc = new Scanner(System.in);
        /*for (int i = 0; i < 2; i++) {
            String name=sc.next(); int age= sc.nextInt(); String nickname= sc.next(); int year= sc.nextInt(); double throwpercen= sc.nextDouble(); int gamesplayed= sc.nextInt();
            bb1[i] = new BasketBallPlayer(name,age,nickname,year,throwpercen,gamesplayed);

        }
        for (int i = 0; i < 2; i++) {
            bb1[i].freethrow();
        }*/

        Inheritance inher = new Inheritance("Pramod", 24, "Pammu", 1999, 84.15, 864);
        inher.print();

        System.out.println(inher.getPlayename());
        inher.setPlayename("pramod");
        System.out.println(inher.getPlayename());
        inher.freethrow();

        Abstract_inhir ab_inhir = new Abstract_inhir();
        System.out.println(ab_inhir.returnName());
    }
}

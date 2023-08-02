package org.JDBConnection;

import java.util.Random;

public class BBallPlayer {
    String name;
    int age;
    String nickname;
    int year;

    double throwpercen;
    int gamesplayed;
    public BBallPlayer(String name, int age, String nickname, int year, double throwpercen, int gamesplayed) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
        this.year = year;
        this.throwpercen = throwpercen;
        this.gamesplayed = gamesplayed;
    }

    public BBallPlayer() {

    }

    protected void freethrow() {
        Random rn = new Random();
        double freethrow = rn.nextDouble();
        System.out.println("Free throw " + freethrow);
        if (freethrow * 100 > throwpercen) {
            System.out.println(name + " failed to score free throw.");
        }
        else {
            System.out.println(name + " Sored free throw");
        }
    }
}


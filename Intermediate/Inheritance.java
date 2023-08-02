package org.Intermediate;

public class Inheritance extends BasketBallPlayer{

    private String playename="Naveen";
    public Inheritance(String name, int age, String nickname, int year, double throwpercen, int gamesplayed) {
        super(name, age, nickname, year, throwpercen, gamesplayed);
    }
    public void print(){
        System.out.println("This is Child class");
    }

    public String getPlayename(){
        return playename;
    }

    public void setPlayename(String playename) {
        this.playename = playename;
    }
    public void freethrow(){
        System.out.println("Child free throw method");
        System.out.println(super.age);
        System.out.println(playename);
    }

}

package org.IntermediateToAdvance;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class BBPlayer extends BasketBallPlayer implements AvarageThrow{
    public BBPlayer(String name, int age, String nickname, int year, double throwpercen, int gamesplayed ){
        super(name,age,nickname,year,throwpercen,gamesplayed);
    }

    Scanner sc = new Scanner(System.in);
    @Override
    public double age() {
        double th = sc.nextDouble();
        double tho;
        tho=th / 125 * 100;
        return tho;
    }
}

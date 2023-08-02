package org.CassinoGame;
import java.util.*;
public class sString {
    public static void main(String[] args) {
        long time=System.nanoTime();
//        String testing="";
//        for (int i = 0; i < 100000; i++) {
//            testing+=i;
//        }

        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < 100000; i++) {
            str.append(i);
        }

//        StringBuffer str = new StringBuffer("");
//        for (int i = 0; i < 100000; i++) {
//            str.append(i);
//        }

        long time1=System.nanoTime();
        long time2=time1-time;
        System.out.println("It took: "+ time2/1000000 +"ms");
    }
}

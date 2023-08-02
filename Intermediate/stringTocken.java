package org.Intermediate;

import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.util.Collections.sort;

public class stringTocken {
    public static void main(String[] args) {
        String str ="World will be doomed without |'sanatana Dharma'";
        StringTokenizer str1 =new StringTokenizer(str, "|");
        ArrayList<String> st = new ArrayList<>();

        System.out.println(str1.countTokens());
        while(str1.hasMoreTokens()){
            //st.add(str1.nextToken());
            System.out.println(str1.nextElement());

        }
        //ort(st);
        for (String i: st){
            System.out.print(i+" ");
        }
    }
}

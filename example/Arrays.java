package org.example;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int[] Arr = new int[5];
        int[] Arr1 ={1,2,3};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            Arr[i]=num;
        }
        for (int j = 0; j < Arr1.length; j++) {
            System.out.println(Arr1[j]);
        }
    }
}

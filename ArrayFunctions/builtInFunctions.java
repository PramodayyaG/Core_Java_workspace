package org.ArrayFunctions;

//import the java util to ensure array class is loaded

import java.util.*;

import java.math.*;

public class builtInFunctions {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        int[] arr1 = {20,45,30,10};
        int[] arr2 = new int[4];
        System.out.println(Arrays.toString(arr));

        //Check the arrays are equals
        System.out.println(Arrays.equals(arr, arr1));

        //fill the array value with default values
        Arrays.fill(arr2, 200);
        System.out.println(Arrays.toString(arr2));
        //we can modify array values in run time using built in funtions
        /*Arrays.fill(arr1,200);
        System.out.println(Arrays.toString(arr1));*/
        System.out.println(Arrays.equals(arr1, arr2));

        //Array sort
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Copy the array");
        int[] copy_arr = Arrays.copyOf(arr1,2);
        System.out.println(Arrays.toString(copy_arr));
        int[] copy_of_range=Arrays.copyOfRange(arr1,1,4);
        System.out.println(Arrays.toString(copy_of_range));

        System.out.println(Arrays.binarySearch(arr1, 10));

        //Math min max func
        System.out.println(Math.min(30,40));

        //Math: random and round func
        double random = Math.random();
        System.out.println(random);
        System.out.println(Math.round(random));

        //Math Power func
        System.out.println("2 to the Power 4 is " + Math.pow(2, 10));

        //Math: Sqrt func
        System.out.println("Sqrt of 16 is " + Math.sqrt(24));
    }
}

package org.collectionPkg;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

import static java.util.Collection.*;
import static java.util.Collections.reverse;
import static java.util.Collections.sort;

public class stringArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(2);
        System.out.println("initial size "+list.size());
        list.add(100);
        list.add(30);
        list.add(30);
        System.out.println("Final size "+list.size());
        System.out.println("Integer array list");
        for (Integer i: list) {
            System.out.println(i);
        }
        list.clear();
        sort(list); reverse(list);
        for (Integer i: list) {
            System.out.println(i);
        }
    }
}

package org.collectionPkg;

import java.util.LinkedList;

public class likedList {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        str.add("Bat");
        str.add("Ball");

        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
        System.out.println(str);

        if (!str.isEmpty()) {
            System.out.println("The fist element of the list :"+str.getFirst());
        }else System.out.println("There are no elements in list");

    }
}

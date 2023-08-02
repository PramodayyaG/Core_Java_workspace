package org.collectionPkg;
import java.util.Vector;
import java.util.Vector.*;
public class vectorList {

    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        System.out.println(vec.capacity());

        vec.add("Cleaning");
        vec.add("Playing");
        vec.add("Eating");

        System.out.println("After adding 3 ele : "+vec.capacity());

        System.out.println("First element : "+vec.firstElement());
        System.out.println("Last element : "+vec.lastElement());
    }
}

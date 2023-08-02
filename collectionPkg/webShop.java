package org.collectionPkg;

import java.util.ArrayList;
import java.util.Scanner;

public class webShop {

    public static void main(String[] args) {
        ArrayList<Products> product = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Do you wanna continue to add(yes/no):" );
            String usrInput=sc.next();
            if(usrInput.equalsIgnoreCase("yes") || usrInput.equalsIgnoreCase("y")){
                System.out.println("Add Product: Name   Price   Description");
                String name=sc.next(); double price=sc.nextDouble(); String desc=sc.next();
                product.add(new Products(name,price,desc));
            }else if(usrInput.equalsIgnoreCase("no") || usrInput.equalsIgnoreCase("n")){break;}
        }
        System.out.println(product);

    }
}

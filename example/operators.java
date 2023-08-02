package org.example;

public class operators {

    public static void main(String[] args) {
        String car_model = "Suzuki";
        int price=1000;
        if (price <= 2000) {
            System.out.println("Price is less");
        }
        else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
        int j=2;
        while (j<=1){
            System.out.println("while sucks");
            j++;
        }
        int k=2;
        do {
            System.out.println("do while also sucks"); k++;
        } while (k<=1);
    }
}

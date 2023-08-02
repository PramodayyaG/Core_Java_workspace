package org.InnerClass;

class PizzaSize {

    private String name = "Margreta";
    private String pizzasize;
    private double price;

    public PizzaSize(String name, String pizzasize, double price) {
        this.name = name;
        this.pizzasize=pizzasize;
        this.price=price;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String pizzasize(){
        return pizzasize;
    }
}

public class Pizza{

    public static void main(String[] args) {
        PizzaSize firstpizza = new PizzaSize("Onion", "large", 99.9);
        System.out.println(firstpizza.getName());
    }
}

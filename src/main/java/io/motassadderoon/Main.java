package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        // Creating Pizza Types
        PizzaType veggie = new VeggiePizza();
        PizzaType pepperoni = new PepperoniPizza();

        // Creating Pizzas with different styles
        Pizza italianVeggie = new ItalianPizza(veggie);
        Pizza americanPepperoni = new AmericanPizza(pepperoni);

        // Preparing Pizzas
        italianVeggie.prepare();
        americanPepperoni.prepare();
    }
}

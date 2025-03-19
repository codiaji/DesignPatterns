package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Pizza italianVeggie = new ItalianVeggiePizza();
        italianVeggie.prepare();

        Pizza americanPepperoni = new AmericanPepperoniPizza();
        americanPepperoni.prepare();
    }
}

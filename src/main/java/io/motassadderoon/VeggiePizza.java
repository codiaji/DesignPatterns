package io.motassadderoon;

public class VeggiePizza implements PizzaType {
    @Override
    public void addIngredients() {
        System.out.println("Adding veggies, cheese, and tomato sauce.");
    }
}

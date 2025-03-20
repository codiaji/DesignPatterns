package io.motassadderoon;

public class PepperoniPizza implements PizzaType {
    @Override
    public void addIngredients() {
        System.out.println("Adding pepperoni, cheese, and tomato sauce.");
    }
}

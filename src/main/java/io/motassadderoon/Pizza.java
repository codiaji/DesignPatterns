package io.motassadderoon;

public abstract class Pizza {
    protected PizzaType pizzaType; // Bridge to PizzaType

    public Pizza(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public abstract void prepare();
}

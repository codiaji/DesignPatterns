package io.motassadderoon;

public class AmericanPizza extends Pizza {
    public AmericanPizza(PizzaType pizzaType) {
        super(pizzaType);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing American-style pizza...");
        pizzaType.addIngredients();
    }
}

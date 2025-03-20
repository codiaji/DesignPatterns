package io.motassadderoon;

public class ItalianPizza extends Pizza {
    public ItalianPizza(PizzaType pizzaType) {
        super(pizzaType);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Italian-style pizza...");
        pizzaType.addIngredients();
    }
}

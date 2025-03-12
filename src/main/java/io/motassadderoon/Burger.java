package io.motassadderoon;

import java.util.ArrayList;
import java.util.List;

public class Burger {
    private final List<Ingredient> ingredients;
    private final int price;

    public Burger(List<Ingredient> ingredients, int price) {
        this.ingredients=ingredients;
        this.price=price;
    }

    public int getPrice() {
        return this.price;
    }

    public List<Ingredient> getIngredients() {
        return new ArrayList<>(ingredients);
    }
}

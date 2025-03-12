package io.motassadderoon;

import java.util.LinkedList;
import java.util.List;

public class BurgerBuilder {
    List<Ingredient> ingredients=new LinkedList<>();
    private int price;
    public BurgerBuilder(int price) {
        this.price=price;
    }

    public BurgerBuilder addTomato() {
        return addIngredient(new Tomatoes());
    }

    public BurgerBuilder addLettuce() {
        return addIngredient(new Lettuce());
    }

    private BurgerBuilder addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
        this.price+= ingredient.getPrice();
        return this;
    }

    public Burger build() {
        return new Burger(ingredients,price);
    }

}

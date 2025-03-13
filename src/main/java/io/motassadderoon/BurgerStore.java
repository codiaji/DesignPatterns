package io.motassadderoon;

public abstract class BurgerStore {

    public final Burger orderBurger() {
        Burger burger;
        burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();
}

package io.motassadderoon;

public class BeefBurgerStore extends BurgerStore{
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}

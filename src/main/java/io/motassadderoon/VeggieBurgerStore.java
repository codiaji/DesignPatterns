package io.motassadderoon;

public class VeggieBurgerStore extends BurgerStore{
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}

package io.motassadderoon;

public class VeggieBurger extends Burger{
    @Override
    public void prepare() {
        System.out.println("Veggie Burger");
        super.prepare();
    }
}

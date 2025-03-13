package io.motassadderoon;

public class BeefBurger extends Burger{
    @Override
    public void prepare() {
        System.out.println("Beef Burger");
        super.prepare();
    }
}

package io.motassadderoon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BurgerFactoryTest {
    @Test
    void createBurgers() {
        BurgerStore beefBurgerStore=new BeefBurgerStore();
        Burger beefBurger= beefBurgerStore.orderBurger();
        BurgerStore veggieBurgerStore=new VeggieBurgerStore();
        Burger veggieBurger= veggieBurgerStore.orderBurger();
        assertInstanceOf(BeefBurger.class,beefBurger);
        assertInstanceOf(VeggieBurger.class,veggieBurger);
    }
}

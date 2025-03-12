package io.motassadderoon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BurgerTest {

    @Test
    void testBuildABurger() {
        Burger burger= new BurgerBuilder(10)
                .addTomato()
                        .addLettuce()
                                .build();

        assertEquals(burger.getPrice(),13);
        assertEquals(burger.getIngredients().size(),2);
    }
}

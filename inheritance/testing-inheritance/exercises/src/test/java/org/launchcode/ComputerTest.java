package org.launchcode;

import org.junit.jupiter.api.Test;

public class ComputerTest {

    @Test
    public void inheritsSuperInFirstConstructor() {
        Laptop caro = new Laptop ("blue", 2008, "Carolyn");
        assertEquals("Carolyn", caro.getOwner());
    }
}

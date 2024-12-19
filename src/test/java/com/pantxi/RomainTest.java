package com.pantxi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomainTest {

    @Test
    public void testConvert1() {
        assertEquals("I", Romain.convert(1));
    }
}

   /* @Test
    public void testConvert3() {
        assertEquals("III", Romain.convert(3));
    }

    @Test
    public void testConvert4() {
        assertEquals("IV", Romain.convert(4));
    }

    @Test
    public void testConvert10() {
        assertEquals("X", Romain.convert(10));
    }

    @Test
    public void testConvert40() {
        assertEquals("XL", Romain.convert(40));
    }

    @Test
    public void testInvalidNumber() {
        // Test pour un nombre en dehors de la plage
        assertThrows(IllegalArgumentException.class, () -> {
            Romain.convert(51);
        });
    }
} */

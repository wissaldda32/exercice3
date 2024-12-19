package com.pantxi;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RomainTest {


    @Test
    public void testConvert1() {
        assertEquals("I", Romain.convert(1));
    }

    @Test
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

    public void testConvert11() {
        assertEquals("XI", Romain.convert(11));
    }
@Test
public void testConvert12() {
        assertEquals("XII", Romain.convert(12));
}
@Test
    public void testConvert20() {
        assertEquals("XX", Romain.convert(20));
}
/*
        @Test
        public void testConvert50() {
            assertEquals("L", Romain.convert(50));
        }

 */
}



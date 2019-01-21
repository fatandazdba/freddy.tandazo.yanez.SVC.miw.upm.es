package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C21Test {

    private C21 c12;

    @BeforeEach
    void before(){this.c12 = new C21();}

    @Test
    void testM1() {
        assertEquals("m1", this.c12.m1());
    }

    @Test
    void testM2() {
        assertEquals("m2", this.c12.m2());
    }
}
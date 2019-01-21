package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C11Test {

    @Test
    void m1() {
        assertEquals("m1", new C11().m1());
    }

    @Test
    void m2() {
        assertEquals("m2", new C11().m2());
    }
}
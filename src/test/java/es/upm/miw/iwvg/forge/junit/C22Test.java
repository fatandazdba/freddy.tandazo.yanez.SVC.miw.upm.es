package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C22Test {

    private C22 c22;

    @BeforeEach
    void before(){this.c22 = new C22();}

    @Test
    void testM1() {
        assertEquals("mA", this.c22.mA());
    }
}
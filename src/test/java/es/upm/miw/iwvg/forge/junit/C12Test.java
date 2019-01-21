fpackage es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C12Test {

    @Test
    void mA() {
        assertEquals("mA", new C12().mA());
    }
}
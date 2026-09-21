package com.taller.cicd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSuma() {
        assertEquals(4, 2 + 2, "suma basica");
    }
}

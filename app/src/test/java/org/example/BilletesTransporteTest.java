package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BilletesTransporteTest {
    @Test public void billetesTransporteTest() {
        BilletesTransporte test = new BilletesTransporte();
        assertEquals(test.calcularPrecioPeniques("1 0 0 0"), 12);
        assertEquals(test.calcularPrecioPeniques("0 1 0 0"), 9);
        assertEquals(test.calcularPrecioPeniques("0 0 1 0"), 18);
        assertEquals(test.calcularPrecioPeniques("0 0 0 1"), 12);
        assertEquals(test.calcularPrecioPeniques("1 1 1 1"), 51);

        assertEquals(test.calcularMonedas(12), "0 1 0");
        assertEquals(test.calcularMonedas(9), "0 0 9");
        assertEquals(test.calcularMonedas(18), "0 1 6");
        assertEquals(test.calcularMonedas(12), "0 1 0");
        assertEquals(test.calcularMonedas(51), "0 4 3");
        
    }
}

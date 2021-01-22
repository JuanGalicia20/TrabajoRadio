/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import radio.Radio;

/**
 * Programa de simulacion de radio
 * Algoritmos y Estructuras de datos
 * @author Jonathan Espinoza & Juan Andres Galicia
 * @version 21/01/22
 */
class avanzarTest {

    @Test
    void test() {
            Radio testAvanzar = new Radio();
            testAvanzar.encenderApagar();
            double avanzar = testAvanzar.avanzar();
            assertEquals(540,avanzar);
    }
    
    @Test
    void test2()
    {
    	Radio testAvanzar = new Radio();
        testAvanzar.encenderApagar();
        testAvanzar.amFm();
        double avanzar = testAvanzar.avanzar();
        assertEquals(new Double(87777.9+0.2),avanzar);
    }
}

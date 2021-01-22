/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import radio.radioPrototipo;

/**
 *
 * @author juana
 */
class avanzarTest {

    @Test
    void test() {
            radioPrototipo testAvanzar = new radioPrototipo();
            testAvanzar.encenderApagar();
            double avanzar = testAvanzar.avanzar();
            assertEquals(540,avanzar);
    }
    @Test
    void test2()
    {
    	radioPrototipo testAvanzar = new radioPrototipo();
        testAvanzar.encenderApagar();
        testAvanzar.amFm();
        double avanzar = testAvanzar.avanzar();
        assertEquals(new Double(87.9+0.2),avanzar);
    }

}

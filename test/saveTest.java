/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import radio.Radio;

class saveTest {

	@Test
	void test() {
        Radio testGuardar = new Radio();
        testGuardar.encenderApagar();
        testGuardar.amFm();
        String avanzar = testGuardar.guardar(1);
        assertEquals("Se ha guardado la emisora: 87.9 en el boton: #1",avanzar);
	}

}

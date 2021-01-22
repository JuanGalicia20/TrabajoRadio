import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import radio.Radio;

class guardarTest {

	@Test
	void test() {
        Radio testGuardar = new Radio();
        testGuardar.encenderApagar();
        String avanzar = testGuardar.guardar(1);
        assertEquals("Se ha guardado la emisora: 87.9 en el boton: #1",avanzar);
	}

}

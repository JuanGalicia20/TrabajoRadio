import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import radio.Radio;

class selectTest {

	@Test
	void test() {
		Radio testSelect = new Radio();
		testSelect.encenderApagar();
		testSelect.guardar(1);
        String avanzar = testSelect.seleccionar(1);
        assertEquals("Sintonizando: 530 AM",avanzar);
	}
	@Test
	void test2() {
		Radio testSelect = new Radio();
		testSelect.encenderApagar();
		testSelect.avanzar();
		testSelect.guardar(1);
        String avanzar = testSelect.seleccionar(1);
        assertEquals("Sintonizando: 540 AM",avanzar);
	}
	
	@Test
	void testFM() {
		Radio testSelect = new Radio();
		testSelect.encenderApagar();
		testSelect.amFm();
		testSelect.guardar(1);
        String avanzar = testSelect.seleccionar(1);
        assertEquals("Sintonizando: 87.9 FM",avanzar);
	}

}

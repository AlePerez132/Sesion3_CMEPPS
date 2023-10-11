package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	private static Cuenta aux, aux2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		aux =new Cuenta("12345", "Manuel", 50);
		aux2 =new Cuenta("67890", "Javier", 0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		aux.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		aux.ingresar(1000);
		assertEquals(aux.getSaldo(), 1000);
	}
	
	@Test
	void testRetirar() {
		aux.retirar(1000);
		assertEquals(aux.getSaldo(), 0);
	}	
	
	@Test void operacionCuenta1() {
		aux.retirar(200);
		aux.ingresar(100);
		aux.retirar(200);
		assertEquals(-250, aux.getSaldo());
	}
	
	@Test void operacionCuenta2() {
		aux2.retirar(350);
		aux2.retirar(150);
		aux2.ingresar(50);
		assertEquals(-450, aux2.getSaldo());
	}

}

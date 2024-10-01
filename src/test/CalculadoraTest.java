package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Practica2.Calculadora;

class CalculadoraTest {

	private int valor1;
	private int valor2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
		this.valor1=5;
		this.valor2=3;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void testSuma() {
		int expected=8;
		int actual=Calculadora.suma(valor1, valor2);
		
		assertEquals(expected, actual);
	}

	@Test
	void testResta() {
		int expected=2;
		int actual=Calculadora.resta(valor1, valor2);
		
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplicacion() {
		int expected=15;
		int actual=Calculadora.multiplicacion(valor1, valor2);
		
		assertEquals(expected, actual);
	}

	@Test
	void testDivision() {
		int expected=1;
		int actual=Calculadora.division(valor1, valor2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testDivisionPorCero() {
		this.valor2=0;
		int expected=-1;
		int actual=Calculadora.division(valor1, valor2);
		
		assertEquals(expected, actual);
	}

}

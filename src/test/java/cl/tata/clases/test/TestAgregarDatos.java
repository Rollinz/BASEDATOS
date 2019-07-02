package cl.tata.clases.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cl.tata.clases.BaseDeDatos;
import cl.tata.clases.Dato;

public class TestAgregarDatos {

	private BaseDeDatos bd;
	@Before
	public void setUp() throws Exception {
		bd = new BaseDeDatos();
		bd.agregar(new Dato("A2", "DATO A2"));
		bd.agregar(new Dato("A3", "DATO A3"));
		bd.agregar(new Dato("A4", "DATO A4"));
		bd.agregar(new Dato("A5", "DATO A5"));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test finalizados");
	}

	@Test
	public void siAgregaNoExistenteEntoncesRetornaTrue() {
		assertTrue("Agregando un dato nuevo que debe retorna true",bd.agregar(new Dato("A6", "DATO A6")));
	}
	
	@Test
	public void siAgregaExistenteEntoncesRetornaFalse() {
		assertFalse("Agregando un dato existente que retorna false",bd.agregar(new Dato("A2", "DATO A2")));
	}

	@Test
	public void siAgregaOrdenadoEntoncesRetornaTrue() {
		assertTrue("Agregando un dato que se ingresa en el indice 0 que retorna true", bd.agregar(new Dato("A1", "DATO A1")));;
	}
	
	@Test
	public void siAgregaNullEntoncesRetornaFalse() {
		assertFalse("Agregando un dato null que retorna false", bd.agregar(new Dato(null, null)));
	}
}

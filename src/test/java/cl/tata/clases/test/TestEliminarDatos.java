package cl.tata.clases.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cl.tata.clases.BaseDeDatos;
import cl.tata.clases.Dato;

public class TestEliminarDatos {

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
	public void siEliminaExistenteRetornaTrue() {
		assertTrue("Elimina un dato existente y retorna true", bd.eliminar("A2"));
	}
	
	@Test
	public void siEliminaInexistenteRetornaFalse() {
		assertFalse("Trata de eliminar un dato inexistente y retorna false", bd.eliminar("A8"));
	}

}

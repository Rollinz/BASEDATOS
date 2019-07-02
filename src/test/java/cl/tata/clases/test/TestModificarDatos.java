package cl.tata.clases.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cl.tata.clases.BaseDeDatos;
import cl.tata.clases.Dato;

public class TestModificarDatos {
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
	}

	@Test
	public void siModificaEntoncesRetornaTrue() {
		assertTrue("Si existe entonces modifica y retorna true", bd.modificar(new Dato("A2", "NUEVO DATO A2")));
	}
	
	@Test
	public void siModificaInexistenteRetornaFalse() {
		assertFalse("Si no existe entonces retorna false", bd.modificar(new Dato("A20", "DATO A20")));
	}

}

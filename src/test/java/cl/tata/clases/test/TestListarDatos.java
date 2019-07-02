package cl.tata.clases.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cl.tata.clases.BaseDeDatos;
import cl.tata.clases.Dato;

public class TestListarDatos {

	private BaseDeDatos bd;
	@Before
	public void setUp() throws Exception {
		bd = new BaseDeDatos();
		bd.agregar(new Dato("A1", "DATO A1"));
		bd.agregar(new Dato("A2", "DATO A2"));
		bd.agregar(new Dato("A3", "DATO A3"));
		bd.agregar(new Dato("A4", "DATO A4"));
		bd.agregar(new Dato("A5", "DATO A5"));
		bd.agregar(new Dato("A6", "DATO A6"));
		bd.agregar(new Dato("A7", "DATO A7"));
		bd.agregar(new Dato("A8", "DATO A8"));
		bd.agregar(new Dato("A9", "DATO A9"));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test finalizados");
	}

	@Test
	public void siListarEntoncesRetornaTrue() {
		int largo = bd.listar().size();
		assertTrue("La cantidad que debe retornar es 9 y retorna" + largo, largo == 9);
	}

}

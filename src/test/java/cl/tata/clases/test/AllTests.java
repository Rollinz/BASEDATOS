package cl.tata.clases.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAgregarDatos.class, TestEliminarDatos.class, TestListarDatos.class, TestModificarDatos.class })
public class AllTests {

}

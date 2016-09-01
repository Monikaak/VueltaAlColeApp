import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.pojo.Usuario;

public class UsuarioTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ConstructorPorDefecto() {
		Usuario u = new Usuario();
		assertEquals(-1, u.getId());
		assertEquals("", u.getNombre());
		assertEquals("", u.getPasword());
		assertEquals("", u.getEmail());
		
	}

}

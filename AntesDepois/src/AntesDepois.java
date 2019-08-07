import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class AntesDepois {

	@Before
	public void before() {
		System.out.println("@before");
	}
	
	@After
	public void after() {
		System.out.println("@after");
	}
	@Test
	public void test1() {
		System.out.println("Teste 1");
	}

	@Test
	public void test2() {
		System.out.println("Teste 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Teste 3");
	}

}


import static org.junit.Assert.*;

import org.junit.Test;

public class TesteIMC {

	@Test
	public void test1() {
		Paciente p1= new Paciente(50, 1.75);
		
		p1.CalcularIMC();
		p1.diagnostico();
		assertEquals(double expected, double actual, double epsilon)
		Math.abs(expected - actual) < epsilon

	}

}

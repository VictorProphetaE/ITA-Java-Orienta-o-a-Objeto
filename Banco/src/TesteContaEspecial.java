import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaEspecial extends TesteContaCorrente{

	@Before
	public void inicializaConta()
	{
		cc = new ContaEspecial(100);
		cc.deposita(200);
	}

	
	@Test
	public void saqueMaiorQueSaldo() 
	{
		int valorSacado = cc.sacar(350);
		assertEquals(cc.saldo, 200);
		assertEquals(0, valorSacado);	
	}
	
	@Test
	public void saqueMaiorQueSaldoDentroDoLimite() 
	{
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo, -50);
		assertEquals(250, valorSacado);	
	}
}

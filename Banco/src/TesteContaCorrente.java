import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaCorrente {
	
	ContaCorrente cc;

	@Before
	public void inicializaConta()
	{
		cc = new ContaCorrente();
		cc.deposita(200);
	}
	
	@Test
	public void deposito() 
	{
		assertEquals(cc.saldo, 200);
	}
	
	@Test
	public void saque() 
	{
		int valorSacado = cc.sacar(50);
		assertEquals(cc.saldo, 150);
		assertEquals(50, valorSacado);	
	}
	
	@Test
	public void saqueMaiorQueSaldo() 
	{
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo, 200);
		assertEquals(0, valorSacado);	
	}
}

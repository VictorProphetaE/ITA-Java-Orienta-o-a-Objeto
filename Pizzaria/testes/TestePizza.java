/*
Nome do Projeto: Pizzaria
Descri��o: Este Programa faz o teste da Pizza
Nome: Victor Propheta Erbano
Data de cria��o: 17/03/2018
*/

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestePizza 
{
	//Zera os ingredientes
	@Before
	public void limparRegPizza() 
	{
		Pizza.zeraIngredientes();
	}
	
	//Verifica o pre�o se baseando na qntidade de ingrediente
	@Test
	public void testQuantidadeIngrediente2() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Tomate");
		p.adicionaIngrediente("Queijo");
		assertEquals(15,p.getPreco());
	}
	
	//Verifica o pre�o se baseando na qntidade de ingrediente
	@Test
	public void testQuantidadeIngrediente3() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Tomate");
		p.adicionaIngrediente("Queijo");
		p.adicionaIngrediente("Azeitona");
		assertEquals(20,p.getPreco());
	}

	//Verifica o pre�o se baseando na qntidade de ingrediente
	@Test
	public void testQuantidadeIngrediente6() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Tomate");
		p.adicionaIngrediente("Queijo");
		p.adicionaIngrediente("Azeitona");
		p.adicionaIngrediente("Parmes�o");
		p.adicionaIngrediente("Manjeric�o");
		p.adicionaIngrediente("Mu�arela");
		assertEquals(23,p.getPreco());
	}
	
	//Verifica a qntidade de ingrediente
	@Test
	public void testDeQuantidadeDeIngrediente6() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Tomate");
		p.adicionaIngrediente("Queijo");
		p.adicionaIngrediente("Azeitona");
		p.adicionaIngrediente("Parmes�o");
		p.adicionaIngrediente("Manjeric�o");
		p.adicionaIngrediente("Mu�arela");
		assertEquals(6, Pizza.getIngrediente().size());
	}
		
}



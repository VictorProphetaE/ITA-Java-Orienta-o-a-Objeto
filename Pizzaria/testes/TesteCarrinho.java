/*
Nome do Projeto: Pizzaria
Descrição: Este Programa faz o teste do Carrinho de Compra
Nome: Victor Propheta Erbano
Data de criação: 17/03/2018
*/


import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinho {

	private static final String Null = null;

	//Verifica se o preço final é igual a qntidade de pizzas e seus ingredientes
	@Test
	public void testeprecototal() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Tomate");
		p.adicionaIngrediente("Queijo");
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Tomate");
		p2.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Azeitona");
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Azeitona");
		p1.adicionaIngrediente("Parmesão");
		p1.adicionaIngrediente("Manjericão");
		p1.adicionaIngrediente("Muçarela");
		
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.addPizza(p1);
        carrinho.addPizza(p2);
        carrinho.addPizza(p);

		assertEquals(58,carrinho.getPreco());
	}

	//Verifica se aceita pizza sem ingrediente
	@Test
	public void testesemingrediente() {
		Pizza p = new Pizza();
		p.adicionaIngrediente(Null);
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Tomate");
		p2.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Azeitona");
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Azeitona");
		p1.adicionaIngrediente("Parmesão");
		p1.adicionaIngrediente("Manjericão");
		p1.adicionaIngrediente("Muçarela");
		
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.addPizza(p1);
        carrinho.addPizza(p2);
        carrinho.addPizza(p);

		assertEquals(58,carrinho.getPreco());
	}
}

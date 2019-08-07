/*
Nome do Projeto: Diferentes Produtos
Descrição: Este Programa faz o teste dos Diferentes Produtos
Nome: Victor Propheta Erbano
Data de criação: 24/03/2018
*/

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteClasseProduto {

	Produto produto;
	Produto produto1;
	Produto produto2;
	
	@Before
	public void InicializaProduto()
	{
		produto = new Produto("Calça", 1, 50.95);
		produto1 = new Produto("Camiseta",1, 55.45);
		produto2 = new Produto("Calça", 1, 50.95);

	}
	
	@Test
	public void testeDeProdutosDiferentes() {
		assertEquals(produto.equals(produto1),produto1.equals(produto));
	}

	@Test
	public void testeDeProdutosDiferentes1() {
		assertNotEquals(produto.hashCode(),produto1.hashCode());
	}
	
	@Test
	public void testeDeProdutoIgual() {
		assertEquals(produto.hashCode(),produto2.hashCode());
	}
	
}
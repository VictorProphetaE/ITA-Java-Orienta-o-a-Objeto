/*
Nome do Projeto: Diferentes Produtos
Descrição: Este Programa faz o teste dos Diferentes Produtos
Nome: Victor Propheta Erbano
Data de criação: 24/03/2018
*/

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho {

	ProdutoComTamanho produto;
	ProdutoComTamanho produto1;
	ProdutoComTamanho produto2;
	
	@Before
	public void InicializaProduto()
	{
		produto = new ProdutoComTamanho("Calça", 3, 55.95, 52);
		produto1 = new ProdutoComTamanho("Tenis", 2, 40.50, 52);
		produto2 = new ProdutoComTamanho("Calça", 3, 55.95, 52);
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

/*
Nome do Projeto: Diferentes Produtos
Descri��o: Este Programa faz o teste dos Diferentes Produtos
Nome: Victor Propheta Erbano
Data de cria��o: 24/03/2018
*/

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoDeCompra {

	//Teste de remover Produtos
	@Test
	public void testeRemoverProduto() {
		CarrinhodeCompra carrinho2 = new CarrinhodeCompra();
		Produto produto2 = new Produto("Cal�a", 1, 50.95);
		carrinho2.adicionaProduto(produto2, 3);
		carrinho2.removeProduto(produto2, 8);
		assertEquals(-5,CarrinhodeCompra.getQuantidadeDeProdutos());
	}
	
	//Teste de quantidade de Produtos
	@Test
	public void testedeQuantidadedeProdutos() {
		ProdutoComTamanho produto = new ProdutoComTamanho("Cal�a", 3, 55.95, 52);
		ProdutoComTamanho produto1 = new ProdutoComTamanho("Tenis", 2, 40.50, 52);
		Produto produto2 = new Produto("Cal�a", 1, 50.95);
		CarrinhodeCompra carrinho1 = new CarrinhodeCompra();
		carrinho1.adicionaProduto(produto, 3);
		carrinho1.adicionaProduto(produto1, 2);
		carrinho1.adicionaProduto(produto2, 2);
		assertEquals(2,CarrinhodeCompra.getQuantidadeDeProdutos());
	}
	
}
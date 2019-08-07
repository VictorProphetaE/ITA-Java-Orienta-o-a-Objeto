/*
Nome do Projeto: Diferentes Produtos
Descrição: Este Programa faz adiciona Produtos sem tamanho e com tamanho
Nome: Victor Propheta Erbano
Data de criação: 24/03/2018
*/

import java.util.HashMap;
import java.util.Map;

public class CarrinhodeCompra {

	private Map<Produto, Integer> carrinho = new HashMap<>();
	private static int quantidadeDeProdutos;
	
	//Addiciona os Produtos ao Carrinho de Compra
	
	public void adicionaProduto(Produto produtos, int quantidade)
	{
		quantidadeDeProdutos = 0;
		if(carrinho.containsKey(produtos))
		{
			carrinho.put(produtos, quantidade += quantidade);
		}else
		{
			carrinho.put(produtos, quantidade);
		}
		quantidadeDeProdutos += quantidade;
	}
	
	//Remove os Produtos ao Carrinho de Compra

	public void removeProduto(Produto produtos, int quantidade)
	{
		if(carrinho.containsKey(produtos))
		{
			carrinho.remove(produtos);
			quantidadeDeProdutos -= quantidade;
		}
	}

	//Faz o calculo do total a se pagar baseando na quantidade de produtos

	public double precoTotalDeCompra()
	{
		double total = 0;
		for(Produto produtos: carrinho.keySet())
		{
			total = produtos.getPreco() * quantidadeDeProdutos;
		}
		return total;
	}
			

	public Map<Produto, Integer> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Map<Produto, Integer> carrinho) {
		this.carrinho = carrinho;
	}

	public static int getQuantidadeDeProdutos() {
		return quantidadeDeProdutos;
	}

	public static void setQuantidadeDeProdutos(int quantidadeDeProdutos) {
		CarrinhodeCompra.quantidadeDeProdutos = quantidadeDeProdutos;
	}
	
}

/*
Nome do Projeto: Pizzaria
Descrição: Este Programa faz o calculo do preco das pizzas baseado na quantidade de ingredientes
Nome: Victor Propheta Erbano
Data de criação: 09/03/2018
*/

public class Principal {

	public static void main(String[] args) {
		
		// Pizza 1 com o nome dos ingredientes
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Tomate");
        pizza1.adicionaIngrediente("Queijo");
		
        // Pizza 1 com o nome dos ingredientes
        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Tomate");
        pizza2.adicionaIngrediente("Queijo");
		
        // Pizza 1 com o nome dos ingredientes
        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Tomate");
        pizza3.adicionaIngrediente("Parmesao");

        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.addPizza(pizza1);
        carrinho.addPizza(pizza2);
        carrinho.addPizza(pizza3);

        carrinho.imprimir();
    }
}
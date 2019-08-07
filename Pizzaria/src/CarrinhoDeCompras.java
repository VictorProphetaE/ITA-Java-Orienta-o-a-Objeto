/*
Nome do Projeto: Pizzaria
Descrição: Este Programa faz o calculo do preco das pizzas baseado na quantidade de ingredientes
Nome: Victor Propheta Erbano
Data de criação: 09/03/2018
*/

import java.util.*;

public class CarrinhoDeCompras {

	private List<Pizza> pizzas = new ArrayList<Pizza>();
	
	public CarrinhoDeCompras() 
	{
        pizzas = new ArrayList<>();
    }
	
	public void addPizza(Pizza pizza)
	{
		if (!pizza.contemingr()) throw new IllegalArgumentException();
			pizzas.add(pizza);
	}
	
    public int getPreco()
    {
        int total = 0;
        for (Pizza p : pizzas) {
            total += p.getPreco();
        }
        return total;
    }
	
	//Imprime o valor e os ingredientes
	void imprimir()
	{
        System.out.println("Preco Final: " + getPreco());
        System.out.println("Ingredientes Usados");
		for (Map.Entry<String, Integer> entry : Pizza.getIngrediente().entrySet()) 
            System.out.println(entry.getKey() +" "+  entry.getValue());
	}
		
}
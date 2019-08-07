/*
Nome do Projeto: Pizzaria
Descri��o: Este Programa faz o calculo do preco das pizzas baseado na quantidade de ingredientes
Nome: Victor Propheta Erbano
Data de cria��o: 09/03/2018
*/

import java.util.*;

public class Pizza {
	
	//Vari�veis utilizado no programa
    private static HashMap<String, Integer> ingrediente = new HashMap<String, Integer>();	
    private ArrayList<String> qntdadeingre;
    public static int ingredienteTotal = 0;
	
	//Inicializa��o da variavel
	public Pizza()
	{
	    this.qntdadeingre = new ArrayList<String>();
	}
    
	private static void contabilizaIngrediente(String ingredientes)
	{
        ingrediente.compute(ingredientes, (k, v) -> v == null ? 1 : v + 1);
        ingredienteTotal++;
	}
	
	public void adicionaIngrediente(String ingredientes)
	{
		qntdadeingre.add(ingredientes);
		contabilizaIngrediente(ingredientes);
	}
	
	//Pegando o pre�o
	public int getPreco()
	{
        int quantidadeIngredientes = qntdadeingre.size();
        return quantidadeIngredientes <= 2 ? 15 : quantidadeIngredientes <= 5 ? 20 : 23;
	}
	//Verificando se tem ingredientes
	public boolean contemingr()
	{
		if(qntdadeingre.size() > 0)
			return true;
		else
			return false;
	}
	
	public static HashMap<String, Integer> getIngrediente()
    {
         return ingrediente;
    }
	
	public static void zeraIngredientes(){
		ingredienteTotal = 0;
	}
	
}
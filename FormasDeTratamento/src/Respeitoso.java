/*
Nome do Projeto: Formas de Tratamento
Descri��o: Este Programa faz o Tratamento do nome utilizando a interface
Nome: Victor Propheta Erbano
Data de cria��o: 31/03/2018
*/

public class Respeitoso implements FormatadorNome {

	boolean masculino,feminino;
	
	//Construtor para os boolean
	public Respeitoso(boolean masculino, boolean feminino) {
		this.masculino = masculino;
		this.feminino = feminino;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(masculino)
		{
			return "Sr."+" "+nome+ " "+sobrenome;
		}else
		{
			return "Sra."+" "+nome+" "+sobrenome;
		}			
	}
}
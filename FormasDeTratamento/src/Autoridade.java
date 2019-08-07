/*
Nome do Projeto: Formas de Tratamento
Descri��o: Este Programa faz o Tratamento do nome utilizando a interface
Nome: Victor Propheta Erbano
Data de cria��o: 31/03/2018
*/

import java.util.Arrays;

public class Autoridade {

	private String nome,sobrenome;
	private FormatadorNome formatnome;
	private String copianome,copiasobrenome;

	//Construtor das variaveis
	public Autoridade(String nome, String sobrenome, FormatadorNome formatnome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatnome = formatnome;
	}
	
	//Faz copia do nome e sobrenome para n�o ser feito altera��o dos originais
	public String getTratamento()
	{
		copianome = nome;
		copiasobrenome = sobrenome;
		return formatnome.formatarNome(copianome, copiasobrenome);
		
	}
	
}
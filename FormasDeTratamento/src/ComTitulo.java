/*
Nome do Projeto: Formas de Tratamento
Descrição: Este Programa faz o Tratamento do nome utilizando a interface
Nome: Victor Propheta Erbano
Data de criação: 31/03/2018
*/

public class ComTitulo implements FormatadorNome {

	private String Titulo;
	
	public ComTitulo(String titulo) {
		super();
		Titulo = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return Titulo+" "+nome+" "+sobrenome;
	}

}

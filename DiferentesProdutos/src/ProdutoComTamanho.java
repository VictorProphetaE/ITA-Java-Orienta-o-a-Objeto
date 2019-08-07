/*
Nome do Projeto: Diferentes Produtos
Descrição: Este Programa faz adiciona Produtos sem tamanho e com tamanho
Nome: Victor Propheta Erbano
Data de criação: 24/03/2018
*/

public class ProdutoComTamanho extends Produto {

	private int tamanho;
	
	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	//Sobre escrita hashCode adicionando o tamanho
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + tamanho;
		return result;
	}

	//Sobre escrita equals adicionando o tamanho
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}
	
	
}


public abstract class CarroDeCorrida {

	public abstract void acelerar();

	protected int velocidade;
	protected int velocidadeMax;
	protected String nome;

	public CarroDeCorrida(String nome, int velocidadeMax) {
		this.nome = nome;
		this.velocidadeMax = velocidadeMax;
		this.velocidade =0;
	}
	
	public void frear() {
		velocidade = velocidade / 2;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public String getNome() {
		return nome;
	}
	
}

import javax.swing.plaf.synth.SynthSpinnerUI;

public class CarroSoma extends CarroDeCorrida{
	
	private int potencia;
	
	public CarroSoma(String nome, int potencia, int velocidadeMax) {
		super(nome, velocidadeMax);
		this.potencia = potencia;
	}

	@Override
	public void acelerar() {
		velocidade += potencia;
		if(velocidade > velocidadeMax)
			velocidade = velocidadeMax;
	}
	
	
}

import java.io.IOException;

public class MecanicaUmaVida implements MecanicaDoJogo {

	private FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();
	private BancoDePalavras bpalavras = new BancoDePalavras();
	private boolean correto;
	private String palavraAleatoria = bpalavras.getPalavras();
	private String palavraEmbaralhada  = fabrica.getEmbalarador().embaralhar(palavraAleatoria);
	
	public MecanicaUmaVida() throws IOException {
	} 
	
	@Override
	public boolean corretoErrado(String tentativa) throws IOException {
		if(tentativa.equals(getPalavra()))
		{
			correto = true;
			return true;
		}else
		{
			correto = false;
			return false;
		}
	}

	@Override
	public boolean fimDeJogo(int tentativas) {
		if(tentativas == 1 || correto)
		{
			return true;
		}else return false;
	}

	@Override
	public String getPalavra() throws IOException {
		return palavraAleatoria;
	}

	@Override
	public String getPalavraEmbaralhada() throws IOException {
		return palavraEmbaralhada;
	}

}

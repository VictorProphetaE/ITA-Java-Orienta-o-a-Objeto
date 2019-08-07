import java.io.IOException;

public class FabricaMecanicaDoJogo {

	public MecanicaDoJogo getMecanicaTresVidas() throws IOException
	{
		return new MecanicaTresVidas();
	}
	public MecanicaDoJogo getMecanicaUmaVida() throws IOException
	{
		return new MecanicaUmaVida();
	}
	
}

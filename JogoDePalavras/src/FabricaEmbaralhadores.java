import java.util.Random;

public class FabricaEmbaralhadores {

	public Embaralhador getEmbalarador()
	{
		Random gerador = new Random();
		int random = gerador.nextInt(2);
		if(random == 0)
		{
			return new EmbaralhadorZero();
		}else
		{
			return new EmbaralhadorUm();
		}
	}
	
}

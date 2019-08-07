import java.io.*;

public interface MecanicaDoJogo {

	public boolean corretoErrado(String tentativa) throws IOException;
	public boolean fimDeJogo(int tentativas);
	public String getPalavra() throws IOException;
	public String getPalavraEmbaralhada() throws IOException;
}

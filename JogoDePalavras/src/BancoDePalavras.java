import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class BancoDePalavras {

	private ArrayList<String> palavras = new ArrayList<String>();
	
	private void leitorDePalavras() throws IOException 
	{
		
		try {
			palavras.clear();
			BufferedReader arquivo = new BufferedReader(new FileReader("palavras.txt"));
			String linha = arquivo.readLine();
			while(linha != null){
				palavras.add(linha.toLowerCase());
				linha = arquivo.readLine();
			}
			
			arquivo.close();
		}catch(FileNotFoundException e)
		{
			System.out.println("Arquivo não encontrado");
		}
				
	}

	private ArrayList<String> getListaPalavras() throws IOException {
		this.leitorDePalavras();
		return palavras;
	}

	public String getPalavras() throws IOException 
	{
		
		ArrayList<String> copiaDaLista = (ArrayList<String>) getListaPalavras().clone(); 

		Collections.shuffle(copiaDaLista); 
		String palavraSorteada = copiaDaLista.get(0);
		return palavraSorteada;
	}

}

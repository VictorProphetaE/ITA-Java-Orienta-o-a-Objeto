import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static Scanner input = new Scanner(System.in);
	public static int score = 0;

	public static void main(String[] args) throws IOException {
		
	FabricaMecanicaDoJogo f = new FabricaMecanicaDoJogo();
	boolean loopMenu = true;
	boolean teste = false;
	int tentativas;

	while(loopMenu){
	System.out.println("\n MENU");
	System.out.println("1. Modo Easy");
	System.out.println("2. Modo Hard");
	System.out.println("3. Score");
	System.out.println("4. Sair");
	String menu = input.nextLine();
		
	switch (menu)
	{
	case "1":
		MecanicaDoJogo mEasy = f.getMecanicaTresVidas();
		String palavraEscolhida = mEasy.getPalavra();			
		String palavraEmbaralhada =mEasy.getPalavraEmbaralhada();
			
		System.out.println("\nModo Easy: \n5 tentativas para acertar! \nDica na 3ª tentativa!");
		System.out.println("\nDigite o significado da palavra embaralhada: " +palavraEmbaralhada);
		teste = mEasy.corretoErrado(input.nextLine()); 
		tentativas = 1;
			
		while(!mEasy.fimDeJogo(tentativas))
		{
			System.out.println("\nErrado!");
			System.out.println("Voce ainda tem " + (3-tentativas) +" tentativas!");
			System.out.println("palavra embaralhada: " +palavraEmbaralhada + "\nTente novamente: ");

			teste = mEasy.corretoErrado(input.nextLine());
			tentativas ++;
			if (tentativas == 3)
			{
				System.out.println("Game Over. A palavra era: " + palavraEscolhida );
				score = 0;
			}
		}
		if (teste)
		{
			System.out.println("\nParabéns, você acertou na " +tentativas +"ª tentativa !" );
			score++;
		}
	break;

	case "2":
		MecanicaDoJogo mHard = f.getMecanicaUmaVida();
		String palavraEmbaralhadaH =mHard.getPalavraEmbaralhada();
		String palavraEscolhidaH = mHard.getPalavra();
			
		System.out.println("\nModo Hard: \n3 tentativas para acertar! \nSem dicas!");
		System.out.println("\nDigite o significado da palavra embaralhada: " +palavraEmbaralhadaH);
		teste = mHard.corretoErrado(input.nextLine()); 
		tentativas = 1;
			
		while(!mHard.fimDeJogo(tentativas))
		{
			System.out.println("\nErrado!");
			System.out.println("Voce ainda tem " + (3-tentativas) +" tentativas!");
			System.out.println("palavra embaralhada: " +palavraEmbaralhadaH + "\nTente novamente: ");
			teste = mHard.corretoErrado(input.nextLine());
			tentativas ++;
			if (tentativas == 3)
			{
				System.out.println("Game Over. A palavra era: " + palavraEscolhidaH );
				score = 0;
			}
		}
		if (teste)
		{
			System.out.println("\nParabéns, você acertou na " +tentativas +"ª tentativa !" );
			score++;
		}
	break;

	case "3":
		System.out.println("\nO seu recorde é: " +score);
	break;
			
	case "4":
		loopMenu = false;
			
	}

}

System.out.println("\nFim.");

	
	}
	
}

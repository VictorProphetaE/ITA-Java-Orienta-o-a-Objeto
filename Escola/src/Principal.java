
public class Principal {

	public static void main(String[] args) {
		Aluno victor = new Aluno();
		victor.bim1 = 70;
		victor.bim2 = 60;
		victor.bim3 = 80;
		victor.bim4 = 70;
		
		System.out.println(victor.media());
		System.out.println(victor.passouDeAno());
	}

}

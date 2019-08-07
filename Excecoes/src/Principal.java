
public class Principal {

	public static void main(String[] args){

		a(-100);
		System.out.println("terminando excucao de main()");

	}

	public static void a(int i) 
	{
		System.out.println("executando a()"+i);
		try {
			b(i);
		} catch (Exception e) {
			System.out.println("tratando a excecao: "+e.getMessage());
		}
		System.out.println("terminando excucao de a()");
	}
	
	public static void b(int i) throws Exception
	{
		System.out.println("executando b()"+i);
		if(i>0)
			throw new Exception("mensagem");
		System.out.println("terminando excucao de b()"+i);

	}
	
}


public class Autenticador {

	public Usuario logar(String login, String senha) throws LoginException{
		
		if(login.equals("guerra")&& senha.equals("senha"))
		{
			return new Usuario(login);
		}
		throw new LoginException("O usuario e a senha nao bate,", login);
	}
	
	
}

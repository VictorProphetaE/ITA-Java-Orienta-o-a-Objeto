
public class RegistroPontos {

	private Bonus bonus;
	
	public RegistroPontos(Bonus cb)
	{
		bonus = cb;
	}
	public void FazerUmComentario(Usuario u)
	{	
		u.pontos +=3 * bonus.bonus(u);
	}
	public void CriarUmTopico(Usuario u)
	{
		u.pontos +=5 * bonus.bonus(u);
	}
	public void DarUmLike(Usuario u)
	{
		u.pontos +=1 * bonus.bonus(u);
	}
	
	
}

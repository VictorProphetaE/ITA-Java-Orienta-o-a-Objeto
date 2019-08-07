import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testeregistropontos {

	@Test
	public void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "Victor";
		Bonus cb = new Bonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.CriarUmTopico(u);
		assertEquals(u.pontos,5);
		
	}
	
	@Test
	public void pontosCriarTopicoVIP() {
		Usuario u = new Usuario();
		u.nome = "Victor";
		u.vip = true;
		Bonus cb = new Bonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.CriarUmTopico(u);
		assertEquals(u.pontos,25);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Victor";
		Bonus cb = new Bonus();
		cb.bonusDoDia = 3;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.CriarUmTopico(u);
		assertEquals(u.pontos,15);
	}
	
	
	@Test
	public void pontosCriarTopicoVIPBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Victor";
		u.vip = true;
		Bonus cb = new Bonus();
		cb.bonusDoDia = 2;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.CriarUmTopico(u);
		assertEquals(u.pontos,50);
	}
}

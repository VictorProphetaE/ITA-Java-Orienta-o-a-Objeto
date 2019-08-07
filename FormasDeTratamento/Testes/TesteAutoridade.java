/*
Nome do Projeto: Formas de Tratamento
Descrição: Este Programa faz o Tratamento do nome utilizando a interface
Nome: Victor Propheta Erbano
Data de criação: 31/03/2018
*/

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteAutoridade {

	//É feito a inicialização dos testes
	FormatadorNome formatInformal;
	FormatadorNome formatRespeitosoSr;
	FormatadorNome formatRespeitosoSra;
	FormatadorNome formatComTitulo;
	Autoridade autoridadeMasculinoinf;
	Autoridade autoridadeFeminino;
	Autoridade autoridadeMasculinoRes;
	Autoridade autoridadeMasculinoTitu;
	
	//É feito a inicialização dos testes
	@Before
	public void InicializaTeste(){
		formatInformal = new Informal();
		formatRespeitosoSr = new Respeitoso(true,false);
		formatRespeitosoSra = new Respeitoso(false,true);
		formatComTitulo = new ComTitulo("Magnífico");
		autoridadeMasculinoinf = new Autoridade("David","Santos",formatInformal);
		autoridadeFeminino = new Autoridade("Luisa","Silva",formatRespeitosoSra);
		autoridadeMasculinoRes = new Autoridade("David","Santos",formatRespeitosoSr);
		autoridadeMasculinoTitu = new Autoridade("David","Santos",formatComTitulo);
	}
	
	@Test
	public void testInformal() {
		assertEquals(autoridadeMasculinoinf.getTratamento(), "David");
	}
	
	@Test
	public void testRespeitosoSra() {
		assertEquals(autoridadeFeminino.getTratamento(), "Sra. Luisa Silva");
	}

	@Test
	public void testRespeitosoSr() {
		assertEquals(autoridadeMasculinoRes.getTratamento(), "Sr. David Santos");
	}
	
	@Test
	public void testComTitulo() {
		assertEquals(autoridadeMasculinoTitu.getTratamento(), "Magnífico David Santos");
	}
}

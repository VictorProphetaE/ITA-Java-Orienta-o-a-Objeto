/*
Nome do Projeto: Calculo do IMC
Descrição: Este Programa calcula o Indice de massa corpórea de um paciente no caso 3 pacientes
Nome: Victor Propheta Erbano
Data de criação: 02/03/2018
*/
public class Principal {

	public static void main(String[] args) {

		//Paciente 1 com os seus atributos e o calculo do IMC mais a impressão do seu diagnóstico
		Paciente p1= new Paciente(50, 1.75);
		
		p1.CalcularIMC();
		p1.diagnostico();
		
		//Paciente 2 com os seus atributos e o calculo do IMC mais a impressão do seu diagnóstico
		Paciente p2= new Paciente(101, 1.85);
		
		p2.CalcularIMC();
		p2.diagnostico();
		
		//Paciente 3 com os seus atributos e o calculo do IMC mais a impressão do seu diagnóstico
		Paciente p3= new Paciente(85.8, 1.95);
		
		p3.CalcularIMC();
		p3.diagnostico();
		
	}

}

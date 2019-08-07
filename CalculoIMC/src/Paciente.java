/*
Nome do Projeto: Calculo do IMC
Descrição: Este Programa calcula o Indice de massa corpórea de um paciente no caso 3 pacientes
Nome: Victor Propheta Erbano
Data de criação: 02/03/2018
*/
public class Paciente 
{
	//Variáveis utilizado no programa
	double peso, altura, IMC;
	String nomePaciente;
	
	public Paciente(double quilos, double metros)
	{
		peso = quilos;
		altura = metros;
	}
	
	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	//Calculo do IMC do paciente
	void CalcularIMC()
	{
		IMC = peso/(altura*altura);
		
	}
	
	double getIMC() {
		return IMC;
	}
	
	//Impressão do diagnóstico do paciente
	
	public void diagnostico() {
		
		if(IMC <= 16)
		{
			System.out.println("Baixo peso muito grave " +getIMC()+".");
		}else
		{
			if((IMC == 16) || (IMC <=16.99))
			{
				System.out.println("Baixo peso grave " +getIMC()+".");
			}else
			{
				if((IMC == 17)||(IMC <=18.49))
				{
					System.out.println("Baixo peso " +getIMC()+".");
				}else
				{
					if((IMC == 18.50)||(IMC <= 24.99))
					{
						System.out.println("Peso normal " +getIMC()+".");
					}else
					{
						if((IMC == 25)||(IMC <= 29.99))
						{
							System.out.println("Sobrepeso " +getIMC()+".");
						}else
						{
							if((IMC == 30)||(IMC <= 34.99))
							{
								System.out.println("Obesidade grau I " +getIMC()+".");
							}else
							{
								if((IMC == 35)||(IMC <= 39.99))
								{
									System.out.println("Obesidade grau II " +getIMC()+".");
								}else
								{
									System.out.println("Obesidade grau III " +getIMC()+".");
								}
							}
						}
					}
				}
			}
		}
	}
}
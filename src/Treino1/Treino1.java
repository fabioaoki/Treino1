package Treino1;

import java.util.Random;
import java.util.Scanner;



//import Projeto3.Projeto3.JankenPoEnum;

import java.util.Arrays;

public class Treino1 {
	
	
	public enum JankenPoEnum {
		PEDRA ("Pedra ", 0),
		PAPEL ("Papel ", 1),
		TESOURA ("Tesoura ", 2);
		//
		String nome;
		int valor;
		
		JankenPoEnum(String nome, int valor) {
			this.nome = nome;
			this.valor = valor;
		}

		public String getNome() {
			return nome;
		}

		public int getValor() {
			return valor;
		}

		public static JankenPoEnum getByValor(int valor) {
			for (JankenPoEnum item : JankenPoEnum.values()) {
				if (item.getValor() == valor) {
					return item;
				}
			}
			return null;
		}
		
	}	

	public static void main(String[] args) {
		
		Scanner lerDados = new Scanner (System.in);
		
		boolean continuar = false;
		String numEscString = null;
		int numEsc = 0;
		
		Random rand = new Random();
		int cpu = rand.nextInt(3);
		
			
		
		do {
				try {
					System.out.println("Escolha, PEDRA-0 PAPEL-1 TESOURA-2: ");
					numEscString = lerDados.nextLine();
					numEsc = Integer.parseInt(numEscString);
				
					if ((numEsc < 0) || (numEsc > 2)) {
						System.out.println("Erro! Digite somente numeros, 0, 1 OU 2");
						numEscString = lerDados.nextLine();
					}
					continuar = false;
				}
				catch (Exception e ) {
					System.out.println("Erro");
					continuar = true;
				}
				
			}
			
			while (continuar);
			System.out.println("");
						
			switch (numEsc) {
				case 0: 
					switch (cpu) {
						case 0:
							
							System.out.println("Empate! Tente novamente");
							System.out.println("Jogador escolheu " + JankenPoEnum.getByValor(numEsc).getNome());
							System.out.println("Escolha, PEDRA-0 PAPEL-1 TESOURA-2: ");
							numEscString = lerDados.nextLine();
							numEsc = Integer.parseInt(numEscString);
							System.out.println("Jogador escolheu " + JankenPoEnum.getByValor(numEsc).getNome());
							
							
												
						case 1:
							System.out.println("Você perdeu!");
							break;
							
						case 2:
							System.out.println("Você ganhou!");
							break;
							default:
					}
					break;
				case 1:{
					switch (cpu) {
						case 0:
							System.out.println("Você ganhou! ");
							break;
							
						case 1:
							System.out.println("Empate! Tente novamente");
							System.out.println("Jogador escolheu "  + JankenPoEnum.getByValor(numEsc).getNome());
							System.out.println("Escolha, PEDRA-0 PAPEL-1 TESOURA-2: ");
							numEscString = lerDados.nextLine();
							numEsc = Integer.parseInt(numEscString);
							System.out.println("Jogador escolheu " + JankenPoEnum.getByValor(numEsc).getNome());
							System.out.println("CPU escolheu: " + JankenPoEnum.getByValor(cpu).getNome());
							
							
						case 2:
							System.out.println("Você perdeu! ");
							break;
						default:
					}
					break;
					}
			case 2:{
				switch (cpu) {
					case 0:
						System.out.println("Você perdeu!");
						break;
						
					case 1:
						System.out.println("Você ganhou!");
						break;
						
					case 2:
						System.out.println("Empate! Tente novamente");
						System.out.println("Jogador escolheu " + JankenPoEnum.getByValor(numEsc).getNome());
						System.out.println("CPU escolheu: " + JankenPoEnum.getByValor(cpu).getNome());
						System.out.println("Escolha, PEDRA-0 PAPEL-1 TESOURA-2: ");
						numEscString = lerDados.nextLine();
						numEsc = Integer.parseInt(numEscString);
						
					default:
				}
				break;
			}
		}
			
		
	System.out.println("Jogador escolheu " + JankenPoEnum.getByValor(numEsc).getNome());	
	System.out.println("CPU escolheu: " + JankenPoEnum.getByValor(cpu).getNome());
	

			
			
			

	}

}

package Aula2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Programa {
	
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
			// Criando a conta
			Conta minhaConta = new Conta(1000.0, "Fabio");
			
			System.out.print("Quanto deseja sacar? R$ ");
			String inputSaca =  br.readLine();
			
			minhaConta.saca(Double.parseDouble(inputSaca));
			System.out.println("Saldo atual R$  " + minhaConta.saldo);
			
			
			System.out.print("Quanto deseja desepositar? R$ ");
			String inputDeposito = br.readLine();
			minhaConta.depositar(Double.parseDouble(inputDeposito));
				
		System.out.println("Saldo atual R$ " + minhaConta.saldo );
			
			
//			Duck pato = new Duck();
//			
//			pato.Andar();
//			pato.Assobiar();
//			pato.Voar();
			
		}
		
}


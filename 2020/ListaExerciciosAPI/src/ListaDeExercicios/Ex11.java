package ListaDeExercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
	
		/* 		11. Fazer um algoritmo que lê um número e verifica se ele é negativo. 
		 * 			Se for negativo, imprimir na tela a mensagem "Numero negativo".
		*/

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("O número é negativo ?");
		
		System.out.println("Insira um número");
		double num = entrada.nextDouble();
		
		if(num < 0) {
			System.out.println("Número Negativo");
		}
		
		
		
		
		entrada.close();
		
	}

}

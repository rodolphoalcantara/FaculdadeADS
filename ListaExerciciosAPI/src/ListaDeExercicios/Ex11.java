package ListaDeExercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
	
		/* 		11. Fazer um algoritmo que l� um n�mero e verifica se ele � negativo. 
		 * 			Se for negativo, imprimir na tela a mensagem "Numero negativo".
		*/

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("O n�mero � negativo ?");
		
		System.out.println("Insira um n�mero");
		double num = entrada.nextDouble();
		
		if(num < 0) {
			System.out.println("N�mero Negativo");
		}
		
		
		
		
		entrada.close();
		
	}

}

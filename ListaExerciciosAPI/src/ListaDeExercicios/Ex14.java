package ListaDeExercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
	
		/* 		14.Fazer um algoritmo que leia dois n�meros e 
		 * 		imprime a divis�o do maior pelo menor.
		*/

		
		Scanner entrada = new Scanner(System.in);
		
		double a,b;
		
		System.out.println("Divis�o do maior pelo menor.");
		
		System.out.println("Insira o primeiro n�mero: ");
		a = entrada.nextDouble();
		System.out.println("Insira o segundo n�mero: ");
		b = entrada.nextDouble();
		
		if(a>b) {
			System.out.println(a+" dividido por "+b+" �: "+ (a/b));
			
		}else {
			System.out.println(b+" dividido por "+a+" �: "+ (b/a));
		}
		
		
		entrada.close();
		
	}

}

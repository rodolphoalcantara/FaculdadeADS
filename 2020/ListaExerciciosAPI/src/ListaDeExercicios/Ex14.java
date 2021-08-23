package ListaDeExercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
	
		/* 		14.Fazer um algoritmo que leia dois números e 
		 * 		imprime a divisão do maior pelo menor.
		*/

		
		Scanner entrada = new Scanner(System.in);
		
		double a,b;
		
		System.out.println("Divisão do maior pelo menor.");
		
		System.out.println("Insira o primeiro número: ");
		a = entrada.nextDouble();
		System.out.println("Insira o segundo número: ");
		b = entrada.nextDouble();
		
		if(a>b) {
			System.out.println(a+" dividido por "+b+" é: "+ (a/b));
			
		}else {
			System.out.println(b+" dividido por "+a+" é: "+ (b/a));
		}
		
		
		entrada.close();
		
	}

}

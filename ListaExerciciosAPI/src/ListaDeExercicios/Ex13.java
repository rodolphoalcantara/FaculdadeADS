package ListaDeExercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
	
		/* 		13. Fazer um algoritmo que leia três números e imprime o maior deles.
		*/

		
		Scanner entrada = new Scanner(System.in);
		
		double a,b,c,maior;
		
		System.out.println("Maior entre três números!");
		
		System.out.println("Insira o primeiro número: ");
		a = entrada.nextDouble();
		System.out.println("Insira o segundo número: ");
		b = entrada.nextDouble();
		System.out.println("Insira o terceiro número: ");
		c = entrada.nextDouble();
		
		if(a>b && a>c) {
			maior = a;
		}else if(b>a && b>c) {
			maior = b;
		}else {
			maior = c;
		}
		
		System.out.println("o número " +maior+ " é maior que os outros!");
		
		entrada.close();
		
	}

}

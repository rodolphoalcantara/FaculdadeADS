package ListaDeExercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
	
		/* 		13. Fazer um algoritmo que leia tr�s n�meros e imprime o maior deles.
		*/

		
		Scanner entrada = new Scanner(System.in);
		
		double a,b,c,maior;
		
		System.out.println("Maior entre tr�s n�meros!");
		
		System.out.println("Insira o primeiro n�mero: ");
		a = entrada.nextDouble();
		System.out.println("Insira o segundo n�mero: ");
		b = entrada.nextDouble();
		System.out.println("Insira o terceiro n�mero: ");
		c = entrada.nextDouble();
		
		if(a>b && a>c) {
			maior = a;
		}else if(b>a && b>c) {
			maior = b;
		}else {
			maior = c;
		}
		
		System.out.println("o n�mero " +maior+ " � maior que os outros!");
		
		entrada.close();
		
	}

}

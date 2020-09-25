package ListaDeExercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	
		/* 		6. Escreva um algoritmo que leia tr�s n�meros decimais: A, B e C. Em seguida, calcule e mostre:
				a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
				b) a �rea do c�rculo de raio C. (pi = 3.14159)
				c) a �rea do trap�zio que tem A e B por bases e C por altura.
				d) a �rea do quadrado que tem lado B.
				e) a �rea do ret�ngulo que tem lados A e B.
				f) o per�metro do ret�ngulo que tem lados A e B.
		*/

		
		Scanner entrada = new Scanner(System.in);
		double a,b,c;
		double pi = 3.14159;
		
		System.out.println("Geometria!");
		
		System.out.println("Insira o valor do primeiro n�mero: ");
		a = entrada.nextDouble();
		System.out.println("Insira o valor do segundo n�mero: ");
		b = entrada.nextDouble();
		System.out.println("Insira o valor do terceiro n�mero: ");
		c = entrada.nextDouble();
		
		
		System.out.println("Com esses valores:");
		System.out.println("a) A �rea do tri�ngulo ret�ngulo de lados "+a+" e "+c+" �: "+ (a*c)/2);
		System.out.println("b) A �rea do c�rculo de raio "+c+" �: "+ pi*Math.pow(c, 2));
		System.out.println("c) A �rea do trap�zio de lados "+a+" e "+b+" e altura "+c+" �: "+ ((a*b)*c)/2);
		System.out.println("d) A �rea do quadrado de lado "+b+" �: "+ (b*b));
		System.out.println("e) A �rea do retangulo de lados "+a+" e "+b+" �: "+ (a*b));
		System.out.println("f) O per�metro do retangulo de lados "+a+" e "+b+" �: "+ 2*(a+b));
		
		
		
		
		
		entrada.close();
		
	}

}

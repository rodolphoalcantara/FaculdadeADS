package ListaDeExercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	
		/* 		6. Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
				a) a área do triângulo retângulo que tem A por base e C por altura.
				b) a área do círculo de raio C. (pi = 3.14159)
				c) a área do trapézio que tem A e B por bases e C por altura.
				d) a área do quadrado que tem lado B.
				e) a área do retângulo que tem lados A e B.
				f) o perímetro do retângulo que tem lados A e B.
		*/

		
		Scanner entrada = new Scanner(System.in);
		double a,b,c;
		double pi = 3.14159;
		
		System.out.println("Geometria!");
		
		System.out.println("Insira o valor do primeiro número: ");
		a = entrada.nextDouble();
		System.out.println("Insira o valor do segundo número: ");
		b = entrada.nextDouble();
		System.out.println("Insira o valor do terceiro número: ");
		c = entrada.nextDouble();
		
		
		System.out.println("Com esses valores:");
		System.out.println("a) A área do triângulo retângulo de lados "+a+" e "+c+" é: "+ (a*c)/2);
		System.out.println("b) A área do círculo de raio "+c+" é: "+ pi*Math.pow(c, 2));
		System.out.println("c) A área do trapézio de lados "+a+" e "+b+" e altura "+c+" é: "+ ((a*b)*c)/2);
		System.out.println("d) A área do quadrado de lado "+b+" é: "+ (b*b));
		System.out.println("e) A área do retangulo de lados "+a+" e "+b+" é: "+ (a*b));
		System.out.println("f) O perímetro do retangulo de lados "+a+" e "+b+" é: "+ 2*(a+b));
		
		
		
		
		
		entrada.close();
		
	}

}

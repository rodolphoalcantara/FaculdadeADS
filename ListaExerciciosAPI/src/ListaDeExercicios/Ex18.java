package ListaDeExercicios;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
	
		/* 		Leia 3 números decimais A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada: 
		      se A >= B+C, apresente a mensagem: NAO FORMA TRIÂNGULO
			 se A^2 = B^2 + C^2, apresente a mensagem: TRIÂNGULO RETÂNGULO
			 se A^2 > B^2 + C^2, apresente a mensagem: TRIÂNGULO OBTUSÂNGULO
			 se A^2 < B^2 + C^2, apresente a mensagem: TRIÂNGULO ACUTÂNGULO
			 se os três lados forem iguais, apresente a mensagem: TRIÂNGULO EQUILÁTERO
			 se apenas dois dos lados forem iguais, apresente a mensagem: TRIÂNGULO ISÓSCELES
		*/

		
		Scanner entrada = new Scanner(System.in);
		
		double n1, n2, n3;
		double a, b, c;
		
		System.out.println("Triangulos!");
		
		System.out.println("Insira o primeiro número: ");
		n1 = entrada.nextInt();		
		System.out.println("Insira o segundo número: ");
		n2 = entrada.nextInt();
		System.out.println("Insira o terceiro número: ");
		n3 = entrada.nextInt();
		if(n1 == n2 && n2 == n3) {
			a = n1;
			b = n2;
			c = n3;
		}else {
			if(n1>n2 && n1>n3) {
				a = n1;
				if(n2>n3) {
					b=n2;
					c=n3;
				}else {
					b=n3;
					c=n2;
				}			
			}else if(n2>n1 && n2>n3) {
				a = n2;
				if(n1>n3) {
					b=n1;
					c=n3;
				}else {
					b=n3;
					c=n1;
				}
			}else {
				a = n3;
				if(n1>n2) {
					b=n1;
					c=n2;
				}else {
					b=n2;
					c=n1;
				}
			}
		}
		
		if(a>=(b+c)) {
			System.out.println("Não forma Triângulo !");
		}else {
			if(Math.pow(a,2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
			System.out.println("Triângulo Retângulo !");
			}
			if(Math.pow(a,2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
			System.out.println("Triângulo Obtusângulo !");
			}
			if(Math.pow(a,2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
			System.out.println("Triaângulo Acutângulo !");
			}
			if(a == b && b == c && c == a) {
				System.out.println("Triângulo Equilátero");
			}
			if(((a == b) && (a != c)) || ((a == c) && (a != b)) || ((b == c) && (b != a))) {
				System.out.println("Triângulo Isósceles !");
			}
		}
		
		
		
		
		entrada.close();
		
	}

}

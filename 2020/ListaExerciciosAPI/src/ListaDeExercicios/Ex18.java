package ListaDeExercicios;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
	
		/* 		Leia 3 n�meros decimais A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de tri�ngulo que estes tr�s lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada: 
		      se A >= B+C, apresente a mensagem: NAO FORMA TRI�NGULO
			 se A^2 = B^2 + C^2, apresente a mensagem: TRI�NGULO RET�NGULO
			 se A^2 > B^2 + C^2, apresente a mensagem: TRI�NGULO OBTUS�NGULO
			 se A^2 < B^2 + C^2, apresente a mensagem: TRI�NGULO ACUT�NGULO
			 se os tr�s lados forem iguais, apresente a mensagem: TRI�NGULO EQUIL�TERO
			 se apenas dois dos lados forem iguais, apresente a mensagem: TRI�NGULO IS�SCELES
		*/

		
		Scanner entrada = new Scanner(System.in);
		
		double n1, n2, n3;
		double a, b, c;
		
		System.out.println("Triangulos!");
		
		System.out.println("Insira o primeiro n�mero: ");
		n1 = entrada.nextInt();		
		System.out.println("Insira o segundo n�mero: ");
		n2 = entrada.nextInt();
		System.out.println("Insira o terceiro n�mero: ");
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
			System.out.println("N�o forma Tri�ngulo !");
		}else {
			if(Math.pow(a,2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
			System.out.println("Tri�ngulo Ret�ngulo !");
			}
			if(Math.pow(a,2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
			System.out.println("Tri�ngulo Obtus�ngulo !");
			}
			if(Math.pow(a,2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
			System.out.println("Tria�ngulo Acut�ngulo !");
			}
			if(a == b && b == c && c == a) {
				System.out.println("Tri�ngulo Equil�tero");
			}
			if(((a == b) && (a != c)) || ((a == c) && (a != b)) || ((b == c) && (b != a))) {
				System.out.println("Tri�ngulo Is�sceles !");
			}
		}
		
		
		
		
		entrada.close();
		
	}

}

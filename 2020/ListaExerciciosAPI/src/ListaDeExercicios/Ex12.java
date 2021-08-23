package ListaDeExercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
	
		/* 		12.Fazer um algoritmo que leia dois números L e R. O programa deve verificar a
		 * 		maior área entre um quadrado de lado L e um círculo de raio R. 
				Imprimir na tela qual o maior: "Quadrado" ou "Círculo".
		*/

		
		Scanner entrada = new Scanner(System.in);
		
		double l, r, areaQuadrado, areaCirculo;
		double pi = 3.1415;
		
		System.out.println("Quadrado ou Círculo");
		
		System.out.println("Insira o valor do lado do quadrado: ");
		l = entrada.nextDouble();
		
		System.out.println("Insira o valor do raio de um círculo: ");
		r = entrada.nextDouble();
		
		areaQuadrado = l*l;
		areaCirculo = pi*(r*r);
		
		if(areaQuadrado>areaCirculo) {
			
			System.out.println("A maior área pertence ao Quadrado!");
		}else {
			System.out.println("A maior área pertence ao Círculo!");
		}
		
		
		
		
		entrada.close();
		
	}

}

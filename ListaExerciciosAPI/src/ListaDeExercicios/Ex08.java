package ListaDeExercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
	
		/* 		8. Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números.
		*/

		
		Scanner entrada = new Scanner(System.in);
		double a,b,c,d;
		
		System.out.println("Média Aritimética!");
		
		System.out.println("Insira o valor do primeiro número: ");
		a = entrada.nextDouble();
		System.out.println("Insira o valor do segundo número: ");
		b = entrada.nextDouble();
		System.out.println("Insira o valor do terceiro número: ");
		c = entrada.nextDouble();
		System.out.println("Insira o valor do quarto número: ");
		d = entrada.nextDouble();
		
		double resultado = (a+b+c+d)/4;
		
		
		System.out.println("A média entre os valores "+a+", "+b+", "+c+" e "+d+" é: "+resultado);
		
		
		
		
		
		entrada.close();
		
	}

}

package ListaDeExercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
	
		/* 		8. Fazer um algoritmo que leia quatro n�meros e imprime a m�dia aritm�tica dos quatro n�meros.
		*/

		
		Scanner entrada = new Scanner(System.in);
		double a,b,c,d;
		
		System.out.println("M�dia Aritim�tica!");
		
		System.out.println("Insira o valor do primeiro n�mero: ");
		a = entrada.nextDouble();
		System.out.println("Insira o valor do segundo n�mero: ");
		b = entrada.nextDouble();
		System.out.println("Insira o valor do terceiro n�mero: ");
		c = entrada.nextDouble();
		System.out.println("Insira o valor do quarto n�mero: ");
		d = entrada.nextDouble();
		
		double resultado = (a+b+c+d)/4;
		
		
		System.out.println("A m�dia entre os valores "+a+", "+b+", "+c+" e "+d+" �: "+resultado);
		
		
		
		
		
		entrada.close();
		
	}

}

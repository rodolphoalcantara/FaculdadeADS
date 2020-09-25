package ListaDeExercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	
		// 1. Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números. 

		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, produto;
		
		System.out.println("Multiplicação!");
		System.out.println("Insira o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.println("Insira o segundo numero");
		n2 = entrada.nextInt();
		
		produto = n1 * n2;
		
		System.out.println("O resultado da multiplicação entre " + n1 +" e "+ n2 + " é: " + produto);
		
		entrada.close();
		
	}

}

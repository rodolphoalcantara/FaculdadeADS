package ListaDeExercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	
		// 1. Fazer um algoritmo que leia dois n�meros e imprima na tela o produto (multiplica��o) dos dois n�meros. 

		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, produto;
		
		System.out.println("Multiplica��o!");
		System.out.println("Insira o primeiro n�mero: ");
		n1 = entrada.nextInt();
		System.out.println("Insira o segundo numero");
		n2 = entrada.nextInt();
		
		produto = n1 * n2;
		
		System.out.println("O resultado da multiplica��o entre " + n1 +" e "+ n2 + " �: " + produto);
		
		entrada.close();
		
	}

}

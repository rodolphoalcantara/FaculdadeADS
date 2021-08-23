package ListaExercicio3;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * 4. Fazer um programa que lê um número inteiro positivo N e imprime a divisão
		 * do produto dos n primeiros números positivos pela soma dos n primeiros
		 * números positivos. Em outras palavras, você deve dividir o fatorial pela
		 * somatoria do número. Obrigatório utilizar as funções elaboradas nos
		 * exercícios 2 e 3.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira um numero inteiro e positivo: ");
		int n = input.nextInt();
				
		int operacao = fatorial(n)/somatoria(n);
		
		
		System.out.println("O resultado da operação é:");
		System.out.println(operacao);
		
		input.close();
	
	}
	
	static int somatoria(int n) {
		int soma = 0;
		if(n>0) {
			for (int i = n; i > 0; i--) {
				soma += i;
			}
		}	
		return soma;
	}
	static int fatorial(int n) {
		int fat = n;
		if(n>0) {
			for (int i = n; i > 1; i--) {
				fat *= (i-1);
			}
		}
		return fat;
	}

}

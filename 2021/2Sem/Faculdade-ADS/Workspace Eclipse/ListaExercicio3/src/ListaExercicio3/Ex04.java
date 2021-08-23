package ListaExercicio3;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * 4. Fazer um programa que l� um n�mero inteiro positivo N e imprime a divis�o
		 * do produto dos n primeiros n�meros positivos pela soma dos n primeiros
		 * n�meros positivos. Em outras palavras, voc� deve dividir o fatorial pela
		 * somatoria do n�mero. Obrigat�rio utilizar as fun��es elaboradas nos
		 * exerc�cios 2 e 3.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira um numero inteiro e positivo: ");
		int n = input.nextInt();
				
		int operacao = fatorial(n)/somatoria(n);
		
		
		System.out.println("O resultado da opera��o �:");
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

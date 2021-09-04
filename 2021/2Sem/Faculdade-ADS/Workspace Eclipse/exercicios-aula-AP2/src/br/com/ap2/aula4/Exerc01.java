package br.com.ap2.aula4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exerc01 {
	/*
	 * Desenvolver um programa que:
	 * 
	 * � Crie um vetor de 100 n�meros inteiros gerados aleatoriamente (utilize a
	 * classe Random);
	 * 
	 * � Solicite que o usu�rio digite um n�mero;
	 * 
	 * � Utilizando o m�todo de busca bin�ria, verificar se o n�mero consta no
	 * vetor. Caso o n�mero esteja repetido no vetor retornar o primeiro encontrado;
	 * 
	 * � Apresentar um mensagem indicando em qual posi��o do vetor o n�mero foi
	 * encontrado. Caso o n�mero n�o conste no vetor, apresentar uma mensagem
	 * indicando isso.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[] v = geraVetor();
		Arrays.sort(v);

		imprimir(v);
		
		System.out.print("Numero: ");
		int n = leitor.nextInt();
		int p = buscaBinaria(v, n);
		if (p >= 0) {
			System.out.println("Numero na posicao: " + p);
		}else {
			System.out.println("Numero nao consta no vetor");
		}
	}

	public static int[] geraVetor() {
		Random r = new Random();
		int[] vetor = new int[100];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt(1000);
		}

		return vetor;
	}

	public static int buscaBinaria(int[] v, int x) {
		int i = 0;
		int f = v.length - 1;
		while (i <= f) {
			int m = (i + f) / 2;
			if (v[m] == x) {
				return m;
			}
			if (x < v[m]) {
				f = m - 1;
			} else {
				i = m + 1;
			}
		}
		return -1;
	}
	
	public static void imprimir(int[] v) {
	    for (int i = 0; i < v.length; i++) {
	      System.out.print(v[i] + " ");
	    }
	    System.out.println();
	  }
	}
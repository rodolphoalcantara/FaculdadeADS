package br.com.ap2.aula4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exerc02 {
	/*
	 * Desenvolver uma fun��o que recebe um vetor V de tamanho n contendo inteiros e
	 * encontra um par de elementos distintos a e b do vetor que fazem com que a
	 * diferen�a absoluta a-b seja a maior poss�vel. A fun��o deve ter deve ter no
	 * m�ximo n passos, ou seja, o tamanho do vetor V[].
	 */
	public static void main(String[] args) {
		int[] v = {23,45,10,8,5,15,3,19};
		int dif = diferencaAbsoluta1(v);
		int dif2 = diferencaAbsoluta(v);
		System.out.println("Maior diferen�a absoluta1: "+dif);
		System.out.println("Maior diferen�a absoluta: "+dif2);
		
	}

	public static int diferencaAbsoluta(int[] v) {
		int menor = v[0];
		int maior = v[0];
		for (int i = 0; i < v.length; i++) {
			if(v[i] < menor) {
				menor = v[i];
			}
			if(v[i] > maior) {
				maior = v[i];
			}
		}
		return maior - menor;
	}
	
	private static int diferencaAbsoluta1(int[] v) {
		int dif = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				int d = Math.abs(v[i] - v[j]);
				if(d> dif) {
					dif = d;
				}
			}
		}
		return dif;
	}
}
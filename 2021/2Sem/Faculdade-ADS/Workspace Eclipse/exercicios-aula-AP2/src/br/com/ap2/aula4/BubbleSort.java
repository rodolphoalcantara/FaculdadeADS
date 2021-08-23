package br.com.ap2.aula4;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		int[] v = geraVetor();
		bubbleSort(v);
		bubbleSort1(v);
	}
	
	public static int[] geraVetor() {
		Random r = new Random();
		int[] vetor = new int[10000];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt(100000);
		}

		return vetor;
	}

	private static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]+ " ");
		}
		System.out.println();
	}

	private static void bubbleSort(int[] v) {
		long inicio = System.currentTimeMillis();
		int aux = 0 ;
		for (int i = 0; i < v.length -1; i++) {
			for (int j = 0; j < v.length -i -1; j++) {
				if(v[j] > v[j+1]) {
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}
		long fim = System.currentTimeMillis();
		System.out.println("bubbleSort: levou "+(fim-inicio));
	}
	
	private static void bubbleSort1(int[] v) {
		long inicio = System.currentTimeMillis();
		
		int aux = 0 ;
		int j = 1;
		for (int i = 0; i < v.length -j; i++) {
				if(v[i] > v[i+1]) {
					aux = v[i];
					v[i] = v[i+1];
					v[i+1] = aux;
				}
				if(j <= i-1 ) {
					j++;					
				}
		}
		long fim = System.currentTimeMillis();
		System.out.println("bubbleSort1 : levou "+(fim-inicio));
	}
	
	

}

package br.com.ap2.aula5;

public class BubbleSortParImpar {

	public static void main(String[] args) {
		int[] v = {7,3,2,5,4,6,8,1};
		bubbleSortParImpar(v);
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}
	
	public static void bubbleSortParImpar(int[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = 0; j < v.length - i -1; j++) {
				if (!ehPar(v[j]) && ehPar(v[j+1])) {
					int aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}
	}
	
	public static boolean ehPar(int n) {
		return n%2 == 0;
	}

}

package br.com.ap2.aula5;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] v = {3,1,7,5,8,6,2,4};
		insertionSort(v);
		for (int i : v) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void insertionSort(int[] v) {
		for (int i = 0; i < v.length; i++) {
			int j = i;
			int x = v[j];
			while (j > 0 && x < v[j-1]) {
				v[j] = v[j-1];
				j--;
			}
			v[j] = x;
		}
	}

}

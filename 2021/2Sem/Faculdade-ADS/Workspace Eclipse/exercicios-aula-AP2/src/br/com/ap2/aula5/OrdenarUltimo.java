package br.com.ap2.aula5;

public class OrdenarUltimo {
	public static void main(String[] args) {
		int[] v = {3,5,9,11,15,17,19,6};
		ordenarUltimo(v);
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}

	private static void ordenarUltimo(int[] v) {
		int k = v.length - 1;
		int x = v[k];
		while (k > 0 && x < v[k-1]) {
			v[k] = v[k-1];
			k--;
		}
		v[k] = x;
	}
	
	

}

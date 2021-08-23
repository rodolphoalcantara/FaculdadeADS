
public class Ex03 {

	/*
	 	3) Escreva uma função que recebe dois vetores inteiros A[] e B[], em seguida, a sua
		função efetua a UNIÃO entre os vetores, ou seja, os elementos do vetor A mais aos
		elementos do vetor B, desde que os elementos de B não estejam presentes no vetor
		A, ao final sua função retorna uma String com a resposta. Os vetores dados não
		possuem valores duplicados e não estão ordenados.
		Exemplo:
		A[] = { 7, 2, 5, 8, 4} e B[]= {4, 2, 9, 5} então A B= {7, 2, 5, 8, 4, 9}
		A[] = { 3, 9, 11} e B[]= {2, 6, 1} então A B = {3, 9, 11, 2, 6, 1}
	 */
	
	
	public static void main(String[] args) {
		
		int[] A = { 7, 2, 5, 8, 4};
		int[] B = {4, 2, 9, 5};
		System.out.println(uneVetores(A, B));
		
		int C[] = { 3, 9, 11};
		int D[]= {2, 6, 1};
		System.out.println(uneVetores(C, D));
	}
	
	static String uneVetores(int[] A, int[] B) {
		String uniao = "";
		for (int nA : A) {
			uniao += nA + " ";
		}
		for (int nB : B) {
			boolean isEqual = false;
			for (int nA : A) {
				if(nB == nA) isEqual = true;
			}
			if(isEqual == false) uniao += nB + " ";
		}
		return uniao;
	}

}

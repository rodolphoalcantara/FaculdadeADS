
public class Ex02 {

	/*
	 	2) Repita o exerc�cio anterior, agora deve ser retornado em uma String os elementos que
		est�o em A[] mas n�o est�o em B[], ou seja, a diferen�a de A � B, por exemplo:
		A[] = { 7, 2, 5, 8, 4} e B[]= {4, 2, 9, 5} ent�o A � B = {7, 8 }
		A[] = { 3, 9, 11} e B[]= {2, 6, 1} ent�o A � B= {3, 9, 11}
	 */
	
	
	public static void main(String[] args) {
		
		int[] A = { 7, 2, 5, 8, 4};
		int[] B = {4, 2, 9, 5};
		
		System.out.println(diferencaEntreVetores(A, B));
		
		int C[] = { 3, 9, 11};
		int D[]= {2, 6, 1};
		
		System.out.println(diferencaEntreVetores(C, D));
		

	}
	
	static String diferencaEntreVetores(int[] A, int[] B) {
		String diff = "";
		
		for (int nA : A) {
			boolean isEqual = false;
			for (int nB : B) {
				if(nA == nB) isEqual = true;
			}
			if(isEqual == false) diff += nA + " ";
		}
		return diff;
	}

}

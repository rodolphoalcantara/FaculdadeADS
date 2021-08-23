
public class Ex04 {

	/*
	 	4) A INTERCALA��O � o processo utilizado para construir uma vetor ordenado
		crescentemente, de tamanho n+m, a partir de dois vetores j� ordenados de tamanhos
		n e m. Por exemplo, a partir das sequ�ncias abaixo:
		Exemplo:
		A[] = { 1, 3, 6, 7} e B[] = {2, 4, 5}, o novo vetor C � feito a partir de A[] e B[]:
		C = { 1, 2, 3, 4, 5, 6, 7}
		Escreva uma fun��o que recebe dois vetores inteiros A[] e B[], em seguida, a sua
		fun��o calcula e retorna o resultado da INTERCALA��O, ou seja, o vetor C[].
	 */
	
	
	public static void main(String[] args) {
		
		Integer[] A = { 1, 3, 6, 7};
		Integer[] B = { 2, 4, 5 };
		Integer[] C = intercalaVetores(A, B);
		
		for (int n : C) {
			System.out.print(n + " ");
		}
		
	}
	
	static Integer[] intercalaVetores(Integer[] A, Integer[] B) {
		Integer[] C = new Integer[(A.length+B.length)];
		int countA = 0, countB = 1;
		
		for (int i = 0; i < A.length; i++) {
			C[countA] = A[i];
			countA +=2;
		}
		for (int i = 0; i < B.length; i++) {
			C[countB] = B[i];
			countB +=2;	
		}
		
		return C;
	}

}

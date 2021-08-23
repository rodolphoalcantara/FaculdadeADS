package Lista4;

public class Ex09 {

	public static void main(String[] args) {
		/*
		 * 9. Dados dois vetores A e B de mesma dimensão, fazer um programa que calcule
		 * e imprima o produto de cada elemento de A pelo correspondente elemento de B.
		 * O resultado deve ser armazenado em um vetor C.
		 */


		int[] vetorA = new int[] {/*insira os valores*/};
		int[] vetorB = new int[] {/*insira os valores*/};
		
		if(vetorA.length == vetorB.length) {
			int[] vetorC = new int[vetorA.length];
			
			for (int i = 0; i < vetorA.length; i++) {
				vetorC[i] = vetorA[i] * vetorB[i];
				System.out.println(vetorC[i]);
			}
			
		}else {
			System.out.println("Os vetores possuem tamanhos diferentes");
		}
		
	}

}

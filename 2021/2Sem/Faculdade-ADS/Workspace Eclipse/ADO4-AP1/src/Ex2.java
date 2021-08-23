
public class Ex2 {
	
	/*
	 * 2. Faça uma função que some o conteúdo de dois vetores e armazene o resultado
	 * em um terceiro vetor.
	 */	
	
	
	public static void main(String[] args) {
		
		int[] vetorA = new int[] {2,3,8,10,9,10};
		int[] vetorB = new int[] {10,8,3,2,10,9};
		int[] vetorC = new int[vetorA.length];
		
		somaVetores(vetorA, vetorB, vetorC);
		
	}
	
	static void somaVetores(int[] vetorA, int[] vetorB, int[] vetorC) {
		for(int indice = 0; indice < vetorA.length; indice++) {
			vetorC[indice] = (vetorA[indice] + vetorB[indice]);
		}
	}
}

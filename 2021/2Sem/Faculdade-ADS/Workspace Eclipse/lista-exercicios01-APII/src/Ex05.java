
public class Ex05 {

	/*
	 	5) Dado um vetor com n�meros pares e �mpares, escreva uma fun��o para colocar todos
		os n�meros pares � frente no vetor e os �mpares ao final. Voc� n�o pode usar outro
		vetor como �rea auxiliar. 
	 */
	
	
	public static void main(String[] args) {
		
		Integer[] vetor = { 1, 3, 6, 7, 10, 8};
		
		Integer[] vetorDividido = divideParesDeImpares(vetor);
		
		for (Integer i : vetorDividido) {
			System.out.println(i);
		}
		
		
		
		
	}
	
	static Integer[] divideParesDeImpares(Integer[] vetor) {
		int aux = 0, indiceAux = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			
			if(vetor[i]%2 == 0) {
				aux = vetor[i];
				vetor[i] = vetor[indiceAux];
				vetor[indiceAux] = aux;
				indiceAux ++;
			}
		}
		return vetor;
		
	}

}

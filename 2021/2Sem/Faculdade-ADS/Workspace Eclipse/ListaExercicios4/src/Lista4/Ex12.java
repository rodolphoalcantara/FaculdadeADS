package Lista4;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * 12. Dados dois vetores A e B de mesma dimens�o, fazer um programa que
		 * verifica a soma e a m�dia de cada vetor, e imprime a maior soma e a menor
		 * m�dia.
		 */


		int[] vetorA = new int[] {/*insira os valores*/};
		int[] vetorB = new int[] {/*insira os valores*/};
		int somaA=0,somaB=0,mediaA=0,mediaB=0;
		
		for (int item : vetorA) {
			somaA += item;
		}
		for (int item : vetorB) {
			somaB += item;
		}
		
		mediaA = somaA/vetorA.length;
		mediaB = somaB/vetorB.length;
		
		if(somaA > somaB) {
			System.out.println("A maior soma � do vetor A: "+somaA);
		}else {
			System.out.println("A maior soma � do vetor B: "+somaB);			
		}
		
		if(mediaA < mediaB) {
			System.out.println("A menor m�dia � do vetor A: "+mediaA);
		}else {
			System.out.println("A menor m�dia � do vetor B: "+mediaB);			
		}
		
	}
}

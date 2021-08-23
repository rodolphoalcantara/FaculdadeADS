package Lista4;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 3. Dado um vetor de números inteiros, fazer um programa que imprima o maior
		 * elemento do vetor
		 */
		
		int[] vetor = new int[] {/*insira os valores*/};
		int maiorNumero =0;
		
		for(int item : vetor) {
			if(item > maiorNumero) {
				maiorNumero = item;
			}
		}
		System.out.println(maiorNumero);
		
		
	}

}

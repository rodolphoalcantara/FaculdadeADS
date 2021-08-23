package Lista4;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 * 8. Dado um vetor de números inteiros e um número inteiro, fazer um programa
		 * que verifique se o número está presente no vetor.
		 */

		int[] vetor = new int[] {/*insira os valores*/};
		int numero =/*insira o valor*/ 1;
		boolean estaPresente = false;
		for(int item : vetor) {
			if(item == numero) {
				estaPresente = true;
			}
		}
		if(estaPresente) {
			System.out.println("O numero está presente no vetor");
		}else {
			System.out.println("O numero não está presente no vetor");
		}
		
	}

}

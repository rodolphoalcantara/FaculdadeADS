package Lista4;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 * 8. Dado um vetor de n�meros inteiros e um n�mero inteiro, fazer um programa
		 * que verifique se o n�mero est� presente no vetor.
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
			System.out.println("O numero est� presente no vetor");
		}else {
			System.out.println("O numero n�o est� presente no vetor");
		}
		
	}

}

package Lista4;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * 5. Dado um vetor de números inteiros, fazer um programa que imprima a média
		 * dos elementos do vetor.
		 */
		
		int[] vetor = new int[] {/*insira os valores*/};
		int soma = 0, media;
		for(int item : vetor) {
			soma += item;
		}
		media =soma/vetor.length;
		System.out.println(media);
		
		
	}

}

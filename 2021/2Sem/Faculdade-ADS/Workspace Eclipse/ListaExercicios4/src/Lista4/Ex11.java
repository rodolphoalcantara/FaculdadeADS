package Lista4;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * 11. Dado um vetor de n�meros reais, fazer um programa que imprima os n�meros
		 * maiores do que a m�dia dos elementos que est�o nas posi��es pares do vetor.
		 */



		double[] vetor = new double[] {/*insira os valores*/};
		double soma=0, media=0;
		int count = 0;
		
		for (double item : vetor) {
			if(item%2 == 0) {
				soma += item;
				count++;
			}
		}
		media = soma/count;
		
		for (double item : vetor) {
			if(item > media) {
				System.out.println(item);
			}
		}		
	}
}

package Lista4;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * 10. Dado um vetor de números reais e um número real, fazer um programa que
		 * multiplique os elementos de posição ímpar do vetor pelo número real dado e
		 * imprima o resultado.
		 */



		double[] vetor = new double[] {/*insira os valores*/};
		double soma=0, numero = /*insira os valores*/ 1;
		
		for (double item : vetor) {
			if(item%2 != 0) {
				soma += item;
			}
		}
		
		System.out.println(soma*numero);
		
		
	}

}

package Lista4;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * 4. Dado um vetor de números reais, fazer um programa que imprima o menor
		 * elemento do vetor.
		 */
		
		double[] vetor = new double[] {/*insira os valores*/};
		double menorNumero = Double.MAX_VALUE;
		
		for(double item : vetor) {
			if(item < menorNumero) {
				menorNumero = item;
			}
		}
		System.out.println(menorNumero);
		
		
	}

}

package ListaExercicio3;

public class Ex14 {

	public static void main(String[] args) {
		/*
		 * 14. Faça uma função que receba dois números inteiros: um valor A e um valor
		 * N. Imprimir a soma dos N números a partir de A (inclusive). Se N for negativo
		 * ou ZERO, a função deve retornar -1. Exemplo: se A for 3 e N for 2, o
		 * resultado deverá ser 7, pois é a soma de 3 + 4.
		 */



		System.out.println(somatoria(3, 2));
	
	}
	
	static int somatoria(int a, int n) {
		int soma = 0;
		if(n>0) {
			for (int i = a; i < a+n; i++) {
				soma += i;
			}
			return soma;
		}else {
			return -1;
		}
	}
}


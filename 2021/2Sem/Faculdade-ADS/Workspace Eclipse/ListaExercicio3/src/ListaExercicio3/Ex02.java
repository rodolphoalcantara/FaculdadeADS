package ListaExercicio3;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * 2. Fazer uma função chamada somatoria que tem como parâmetro de entrada um
		 * número inteiro positivo N e fornece como saída a soma de todos os números
		 * inteiros positivos menores ou iguais a N. Exemplo: se N for 3, a função deve
		 * retornar 6, que é a soma de 1 + 2 + 3.
		 */
		
		System.out.println(somatoria(3));
		
		
	}
	
	static int somatoria(int n) {
		int soma = 0;
		if(n>0) {
			for (int i = n; i > 0; i--) {
				soma += i;
			}
		}	
		return soma;
	}

}

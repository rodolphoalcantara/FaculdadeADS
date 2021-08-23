package ListaExercicio3;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * 2. Fazer uma fun��o chamada somatoria que tem como par�metro de entrada um
		 * n�mero inteiro positivo N e fornece como sa�da a soma de todos os n�meros
		 * inteiros positivos menores ou iguais a N. Exemplo: se N for 3, a fun��o deve
		 * retornar 6, que � a soma de 1 + 2 + 3.
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

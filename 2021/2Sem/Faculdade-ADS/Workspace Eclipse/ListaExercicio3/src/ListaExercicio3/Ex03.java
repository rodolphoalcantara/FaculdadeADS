package ListaExercicio3;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 3. Fazer uma função chamada fatorial que tem como parâmetro de entrada um
		 * número inteiro positivo n e fornece como saída o fatorial desse número.
		 * Exemplo: se N for 5, a função deve retornar 120, que é a multiplicação de 1 *
		 * 2 * 3 * 4 * 5
		 */
		
		System.out.println(fatorial(5));
		
	}
	
	static int fatorial(int n) {
		int fat = n;
		if(n>0) {
			for (int i = n; i > 1; i--) {
				fat *= (i-1);
			}
		}
		return fat;
	}

}

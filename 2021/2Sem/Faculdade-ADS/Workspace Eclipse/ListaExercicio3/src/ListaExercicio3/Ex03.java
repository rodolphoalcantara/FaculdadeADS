package ListaExercicio3;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 3. Fazer uma fun��o chamada fatorial que tem como par�metro de entrada um
		 * n�mero inteiro positivo n e fornece como sa�da o fatorial desse n�mero.
		 * Exemplo: se N for 5, a fun��o deve retornar 120, que � a multiplica��o de 1 *
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

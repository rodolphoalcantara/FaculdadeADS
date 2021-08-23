package ListaExercicio3;

public class Ex13 {

	public static void main(String[] args) {
		/*
		 * 13. Faça uma função que recebe, por parâmetro, um valor inteiro e positivo e
		 * retorna o número de divisores desse valor.
		 */



		System.out.println(numeroDivisores(10));
	
	}
	
	static int numeroDivisores(int n) {
		int cont = 0;
		if(n>0) {
			for (int i = 1; i <= n ; i++) {
				if(n%i == 0) {
					cont++;
				}
			}
		}
		return cont;
		
	}
}


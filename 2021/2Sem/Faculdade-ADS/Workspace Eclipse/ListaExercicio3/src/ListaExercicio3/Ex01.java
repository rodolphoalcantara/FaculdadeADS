package ListaExercicio3;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 1. Fazer uma fun��o que tem como par�metro de entrada tr�s n�meros inteiros
		 * a, b, c e devolve (retorna) menor dentre os tr�s n�meros.
		 */
		
		
		System.out.println(menorEntreTres(99, 2, 756));

	}
	
	public static int menorEntreTres(int a, int b, int c) {
		if(a<b && a<c) {
			return a;
		}else if(b<a && b<c) {
			return b;
		}else {
			return c;
		}
	}

}

package ListaExercicio3;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 1. Fazer uma função que tem como parâmetro de entrada três números inteiros
		 * a, b, c e devolve (retorna) menor dentre os três números.
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

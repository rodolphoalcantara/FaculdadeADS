package ListaExercicio3;

public class Ex15 {

	public static void main(String[] args) {
		/*
		 * 15. Escreva uma função que recebe, por parâmetro, dois valores X e Z e
		 * calcula e retorna X^Z (sem utilizar funções ou operadores de potência
		 * prontos). Assim sendo, você não pode utilizar a função Math.pow, nem outras
		 * existentes no Java.
		 */




		System.out.println(exponenciacao(2, 4));
	
	}
	
	static double exponenciacao(int x, int z) {
		double exp = 1;
		if(z==0) {
			return x;
		}else {
			for (int i = 0; i < z; i++) {
				exp *= x;
			}
			return exp;
		}
	}
}


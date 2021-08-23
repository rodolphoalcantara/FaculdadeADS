package ListaExercicio3;

public class Ex09 {

	public static void main(String[] args) {
		/*
		 * 9. Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e
		 * retorna essa idade expressa em dias.
		 */
		
		System.out.println(idadeEmDias(25, 0, 0));
	
	}
	
	static int idadeEmDias(int a, int m, int d) {
		return (a*365)+(m*30)+d;
	}

}

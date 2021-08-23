package ListaExercicio3;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * 12. Faça uma função que recebe, por parâmetro, a altura (alt) e o sexo de uma
		 * pessoa, e retorna o seu peso ideal. Para homens, você calcular o peso ideal
		 * usando a fórmula: P = 72,7 * altura - 58. Para mulheres, utilize a fórmula: P
		 * = 62,1 * altura – 44,7.
		 */


		System.out.println(pesoIdeal(1.75, "masculino"));
	
	}
	
	static double pesoIdeal(double alt, String sexo) {
		switch(sexo.toUpperCase()){
			case "M":
			case "MASC":
			case "MASCULINO":
				return (72.7 * alt - 58);
			case "F":
			case "FEM":
			case "FEMININO":
				return (62.1 * alt - 44.7);
			default:
				return -1;
		}
	}
}


package ListaExercicio3;

public class Ex07 {

	public static void main(String[] args) {
		/*
		 * 7. Faça uma função que recebe por parâmetro o raio (R) de uma esfera e
		 * calcula o seu volume, onde o volume é dado por: V = 4/3 × π × R^3
		 */
		System.out.println(calculaVolumeEsfera(5));
		
	}
	
	static double calculaVolumeEsfera(double r) {
		double pi = 3.1415;
		return 4.0/3.0*pi*Math.pow(5, 3);
	}
}

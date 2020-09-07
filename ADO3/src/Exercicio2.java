import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Dados 3 valores (poss�veis lados) verificar se eles formam um tri�ngulo, e em caso
		 * positivo, dizer se � equil�tero, is�sceles ou escaleno;
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com um numero: ");
		double a = entrada.nextDouble();
		System.out.println("Entre com um numero: ");
		double b = entrada.nextDouble();
		System.out.println("Entre com um numero: ");
		double c = entrada.nextDouble();
		
		if(a > b + c || b > a + c || c > a + b) {
			System.out.println("Os valores n�o formam um tri�ngulo.");
		}else {
			if(a == b && b == c) {
				System.out.println("Os valores formam um tri�ngulo equil�tero.");
			}else if (a == b || a == c || b == c){
				System.out.println("Os valores formam um tri�ngulo is�sceles.");
			}else {
				System.out.println("Os valores formam um tri�ngulo escaleno.");
			}
		}
		
		entrada.close();
		
	}

}

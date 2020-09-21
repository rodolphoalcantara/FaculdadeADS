import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Dados 3 valores (possíveis lados) verificar se eles formam um triângulo, e em caso
		 * positivo, dizer se é equilátero, isósceles ou escaleno;
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com um numero: ");
		double a = entrada.nextDouble();
		System.out.println("Entre com um numero: ");
		double b = entrada.nextDouble();
		System.out.println("Entre com um numero: ");
		double c = entrada.nextDouble();
		
		if(a > b + c || b > a + c || c > a + b) {
			System.out.println("Os valores não formam um triângulo.");
		}else {
			if(a == b && b == c) {
				System.out.println("Os valores formam um triângulo equilátero.");
			}else if (a == b || a == c || b == c){
				System.out.println("Os valores formam um triângulo isósceles.");
			}else {
				System.out.println("Os valores formam um triângulo escaleno.");
			}
		}
		
		entrada.close();
		
	}

}

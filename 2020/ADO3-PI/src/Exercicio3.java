import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*
		 * Dado um ano com 4 d�gitos dizer ser ele � um ano bissexto ou n�o. (Lembre-se
		 * que um ano � bissexto se ele for divis�vel por 400 ou se ele for divis�vel por 4 e
		 * n�o por 100.)
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um ano com 4 d�gitos: ");
		int ano = entrada.nextInt();
		String strAno = Integer.toString(ano);
		
		if(strAno.length() == 4) {
			
			if (ano%400 == 0 || (ano%4 == 0 && !(ano%100 == 0))) {
				System.out.println(ano +" � um ano bissexto!");
			}else {
				System.out.println(ano +" n�o � um ano bissexto!");
			}
			
		}else {
			System.out.println("Ano inv�lido");
		}

		entrada.close();
	}
	
}


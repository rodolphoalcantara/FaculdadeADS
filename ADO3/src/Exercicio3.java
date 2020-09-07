import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*
		 * Dado um ano com 4 dígitos dizer ser ele é um ano bissexto ou não. (Lembre-se
		 * que um ano é bissexto se ele for divisível por 400 ou se ele for divisível por 4 e
		 * não por 100.)
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um ano com 4 dígitos: ");
		int ano = entrada.nextInt();
		String strAno = Integer.toString(ano);
		
		if(strAno.length() == 4) {
			
			if (ano%400 == 0 || (ano%4 == 0 && !(ano%100 == 0))) {
				System.out.println(ano +" é um ano bissexto!");
			}else {
				System.out.println(ano +" não é um ano bissexto!");
			}
			
		}else {
			System.out.println("Ano inválido");
		}

		entrada.close();
	}
	
}


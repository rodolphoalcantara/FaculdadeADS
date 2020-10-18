import java.util.Scanner;

public class Ex14 {
	
	/*
	 * 14. Faça um programa que leia um número natural N e calcule a soma abaixo
	 * (lembre-se de que tanto as divisões quanto o resultado devem ser decimais).
	 * Utilize o laço que lhe for mais conveniente.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double res=1.0;
		System.out.println("Calculadora de equações.");
		System.out.println("Dada a equação:");
		System.out.println("S = 1 + 2/3 + 4/5 + 6/7 + ... + 2N/(2N+1)");

		System.out.println("Insira o valor de N: ");
		int n = entrada.nextInt();
		
		if(n >= 0) {
			for (int i = 1; i <= n; i++) {
				res += (i*2.0)/((i*2.0)+1.0);
				/*
				 * System.out.print(i*2.0); 
				 * System.out.println("/"+((i*2.0)+1.0));
				 */
			}
			System.out.println("O resultado é: "+ res);
			
		}else {
			System.out.println("N deve ser um número Natural.");
		}
		entrada.close();
		
	}
	
}

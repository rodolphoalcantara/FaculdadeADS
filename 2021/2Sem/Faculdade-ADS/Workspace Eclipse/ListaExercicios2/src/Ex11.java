import java.util.Scanner;

public class Ex11 {
	
	/*
	 * 11. Faça um programa que leia um número natural N e calcule a soma abaixo
	 * (lembre-se de que tanto as divisões quanto o resultado devem ser decimais).
	 * Utilize o laço que lhe for mais conveniente
	 */
				
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double soma = 0, div;
		
		System.out.println("Calculadora de equações.");
		System.out.println("Dada a equação:");
		System.out.println("S = 1 + 1/2 + 1/3 + 1/4 + 1/5 +...+ 1/N ");
		System.out.println("Insira o valor de N: ");
		int n = entrada.nextInt();
		if(n >=0) {
			for (int i = 1; i <= n; i++) {
				div = 1.0/i;
				if(i%2==0 || i == 1) {
					soma += div;
				}else {
					soma -= div;
				}
			}
			System.out.println("O resultado é: " + soma);
			
			
		}else {
			System.out.println("N deve ser um número Natural");
		}
		
		
		entrada.close();
		
	}
	
}

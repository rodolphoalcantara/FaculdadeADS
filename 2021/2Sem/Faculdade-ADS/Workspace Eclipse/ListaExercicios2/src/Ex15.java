import java.util.Scanner;

public class Ex15 {
	
	/*
	 * 15. Faça um programa que leia um número inteiro N maior do que zero e calcule
	 * o fatorial desse número. Fatorial de N é representado por N! e calculado da
	 * seguinte maneira:
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculadora o fatorial de N");
		System.out.println("Lembrando: N! = N*(N-1)");
		

		System.out.println("Insira o valor de N: ");
		int n = entrada.nextInt();
		int res=1;
		
		if(n > 0) {
			for (int i = n; i > 0; i--) {
				res *= i;
			}
			System.out.println("O resultado é: "+ res);
			
		}else {
			System.out.println("N deve ser um número Natural maior que zero.");
		}
		entrada.close();
		
	}
	
}

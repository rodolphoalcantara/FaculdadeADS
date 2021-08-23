import java.util.Scanner;

public class Ex15 {
	
	/*
	 * 15. Fa�a um programa que leia um n�mero inteiro N maior do que zero e calcule
	 * o fatorial desse n�mero. Fatorial de N � representado por N! e calculado da
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
			System.out.println("O resultado �: "+ res);
			
		}else {
			System.out.println("N deve ser um n�mero Natural maior que zero.");
		}
		entrada.close();
		
	}
	
}

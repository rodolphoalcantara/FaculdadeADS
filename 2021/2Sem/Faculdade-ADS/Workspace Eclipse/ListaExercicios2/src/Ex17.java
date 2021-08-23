import java.util.Scanner;

public class Ex17 {
	
	/*
	 * 17. Ler um número inteiro N e calcular e imprimir todos os seus divisores.
	 * Exemplo: para o número 6, temos os seguintes divisores 1, 2, 3, 6. Utilize o
	 * laço que lhe for mais conveniente.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculadora de Divisores.");
		System.out.println("Insira o número a ser calculado: ");
		int n = entrada.nextInt();
		
		System.out.println("Os divisores de "+n+" são: ");
		if(n<0) {
			n*=-1;
		}	
		if(n==0) {
			System.out.println("Os divisores de Zero são infinitos.");
		}else{
			for (int i = 1; i <= n; i++) {
				if(n%i==0) {
					System.out.print(i);
					System.out.print(" ");
				}
			}
			
		}
		entrada.close();
		
	}
	
}

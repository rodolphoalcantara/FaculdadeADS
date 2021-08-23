import java.util.Scanner;

public class Ex18 {
	
	/*
	 * 18. A seguinte sequência de números 0, 1, 1, 2, 3, 5, 8, 13, 21... é
	 * conhecida como série de Fibonacci. Nessa sequência, cada número, depois dos 2
	 * primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um
	 * inteiro N (onde N < 46) e mostre os N primeiros números dessa série. Utilize
	 * o laço que lhe for mais conveniente.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int atual = 0;
		int prox = 1;
		System.out.println("Sequencia de Fibonacci.");
		System.out.println("Insira o número de valores, até 45 posições, a serem mostrados: ");
		int n = entrada.nextInt();
		if(n<0) {
			n*=-1;
		}
		if(n<46) {
			System.out.println(0);
			for (int i = 1; i < n; i++) {
				prox += atual;
				atual = prox - atual;
								
				System.out.println(atual);
			}
		}else {
			System.out.println("O valor deve ser menor que 46.");
		}
		
		entrada.close();
		
	}
	
}

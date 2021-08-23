import java.util.Scanner;

public class Ex18 {
	
	/*
	 * 18. A seguinte sequ�ncia de n�meros 0, 1, 1, 2, 3, 5, 8, 13, 21... �
	 * conhecida como s�rie de Fibonacci. Nessa sequ�ncia, cada n�mero, depois dos 2
	 * primeiros, � igual � soma dos 2 anteriores. Escreva um algoritmo que leia um
	 * inteiro N (onde N < 46) e mostre os N primeiros n�meros dessa s�rie. Utilize
	 * o la�o que lhe for mais conveniente.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int atual = 0;
		int prox = 1;
		System.out.println("Sequencia de Fibonacci.");
		System.out.println("Insira o n�mero de valores, at� 45 posi��es, a serem mostrados: ");
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

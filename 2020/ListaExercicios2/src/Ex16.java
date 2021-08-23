import java.util.Scanner;

public class Ex16 {
	
	/*
	 * 16. Leia um valor inteiro N. Este valor será a quantidade de valores que
	 * serão lidos em seguida do usuário. Para cada valor lido, mostre uma mensagem
	 * em português dizendo se este valor lido é par (PAR), ímpar (ÍMPAR), positivo
	 * (POSITIVO) ou negativo (NEGATIVO). No caso do valor ser igual a zero (0), seu
	 * programa deverá imprimir apenas NULO. Utilize o laço DO-WHILE.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Par ou Impar, Positivo ou Negativo");
		System.out.print("Insira o numero de leituras a realizar: ");
		int vezes = entrada.nextInt();

		do {
			System.out.print("Insira um número: ");
			int n = entrada.nextInt();
			if(n>0) {
				System.out.print("POSITIVO");
				if(n%2==0) {
					System.out.println(" PAR");
				}else {
					System.out.println(" IMPAR");
				}
			}else if(n<0) {
				System.out.print("NEGATIVO");
				if(n%2==0) {
					System.out.println(" PAR");
				}else {
					System.out.println(" IMPAR");
				}
			}else {
				System.out.println("NULO");
			}
						
			vezes--;
		}while(vezes>0);
		
		System.out.println("Finalizando execução...");
		
		entrada.close();
		
	}
	
}

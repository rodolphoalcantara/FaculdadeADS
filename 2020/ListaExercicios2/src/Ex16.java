import java.util.Scanner;

public class Ex16 {
	
	/*
	 * 16. Leia um valor inteiro N. Este valor ser� a quantidade de valores que
	 * ser�o lidos em seguida do usu�rio. Para cada valor lido, mostre uma mensagem
	 * em portugu�s dizendo se este valor lido � par (PAR), �mpar (�MPAR), positivo
	 * (POSITIVO) ou negativo (NEGATIVO). No caso do valor ser igual a zero (0), seu
	 * programa dever� imprimir apenas NULO. Utilize o la�o DO-WHILE.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Par ou Impar, Positivo ou Negativo");
		System.out.print("Insira o numero de leituras a realizar: ");
		int vezes = entrada.nextInt();

		do {
			System.out.print("Insira um n�mero: ");
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
		
		System.out.println("Finalizando execu��o...");
		
		entrada.close();
		
	}
	
}

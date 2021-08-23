import java.util.Scanner;

public class Ex03 {
	
	//3. Escreva um programa que leia um conjunto de 10 n�meros inteiros positivos. Seu programa deve determinar
	//e imprimir o maior deles. Use o la�o FOR.
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maiorNumero = 0;
		
		System.out.println("Insira 10 n�meros e diremos o maior entre eles.");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Insira um n�mero: ");
			int n = entrada.nextInt();
			
			if (n>=maiorNumero) {
				maiorNumero = n;
			}
			
		}
		
		System.out.println("Dentre estes 10 n�meros o maior �: " + maiorNumero);
		
		
		entrada.close();
	}
	
	
}

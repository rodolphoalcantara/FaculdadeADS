import java.util.Scanner;

public class Ex03 {
	
	//3. Escreva um programa que leia um conjunto de 10 números inteiros positivos. Seu programa deve determinar
	//e imprimir o maior deles. Use o laço FOR.
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maiorNumero = 0;
		
		System.out.println("Insira 10 números e diremos o maior entre eles.");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Insira um número: ");
			int n = entrada.nextInt();
			
			if (n>=maiorNumero) {
				maiorNumero = n;
			}
			
		}
		
		System.out.println("Dentre estes 10 números o maior é: " + maiorNumero);
		
		
		entrada.close();
	}
	
	
}

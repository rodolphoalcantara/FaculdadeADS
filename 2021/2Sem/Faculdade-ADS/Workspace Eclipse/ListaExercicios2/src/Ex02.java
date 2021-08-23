import java.util.Scanner;

public class Ex02 {
	
	//2. Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, e mostre o
	//resultado obtido. Use o laço WHILE.
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int n = entrada.nextInt();
		int contador = 0;
		int res = 0;
		
		while(contador <= n) {
			res+=contador;
			contador++;
		}
		
		System.out.println("A soma dos numeros de 1 até "+ n + " é: " + res);
		
		entrada.close();
	}
	
	
}

import java.util.Scanner;

public class Ex02 {
	
	//2. Fa�a um programa que leia um n�mero N do usu�rio, some todos os n�meros inteiros de 1 a N, e mostre o
	//resultado obtido. Use o la�o WHILE.
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um n�mero: ");
		int n = entrada.nextInt();
		int contador = 0;
		int res = 0;
		
		while(contador <= n) {
			res+=contador;
			contador++;
		}
		
		System.out.println("A soma dos numeros de 1 at� "+ n + " �: " + res);
		
		entrada.close();
	}
	
	
}

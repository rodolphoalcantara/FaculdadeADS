import java.util.Scanner;

public class Ex21 {
	
	/*
	 * 21. Na matemática, um número perfeito é um número inteiro para o qual a soma
	 * de todos os seus divisores positivos próprios (excluindo ele mesmo) é igual
	 * ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6.
	 * Sua tarefa é escrever um programa que imprima se um determinado número é
	 * perfeito ou não. Utilize o laço que lhe for mais conveniente.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		
		System.out.println("Número perfeito.");
		System.out.print("Insira um número: ");
		int n = entrada.nextInt();
		
		System.out.print("Os divisores de "+n+" são: ");
		if(n<0) {
			n*=-1;
		}	
		if(n==0) {
			System.out.println("Zero não é um número perfeito");
		}else{
			for (int i = 1; i <= n; i++) {
				if(n%i==0 && n != i) {
					soma+=i;
					System.out.print(i);
					System.out.print(" ");
				}
			}
			System.out.println();
			System.out.println("A soma dos divisores de "+n+" é: "+soma);
			if(soma == n) {
				System.out.println("O número "+n+" é um número perfeito.");
			}else {
				System.out.println("O número "+n+" não é um número perfeito.");				
			}
			
		}
		
		entrada.close();
		
	}
	
}

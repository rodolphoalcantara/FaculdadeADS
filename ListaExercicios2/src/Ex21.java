import java.util.Scanner;

public class Ex21 {
	
	/*
	 * 21. Na matem�tica, um n�mero perfeito � um n�mero inteiro para o qual a soma
	 * de todos os seus divisores positivos pr�prios (excluindo ele mesmo) � igual
	 * ao pr�prio n�mero. Por exemplo o n�mero 6 � perfeito, pois 1+2+3 � igual a 6.
	 * Sua tarefa � escrever um programa que imprima se um determinado n�mero �
	 * perfeito ou n�o. Utilize o la�o que lhe for mais conveniente.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		
		System.out.println("N�mero perfeito.");
		System.out.print("Insira um n�mero: ");
		int n = entrada.nextInt();
		
		System.out.print("Os divisores de "+n+" s�o: ");
		if(n<0) {
			n*=-1;
		}	
		if(n==0) {
			System.out.println("Zero n�o � um n�mero perfeito");
		}else{
			for (int i = 1; i <= n; i++) {
				if(n%i==0 && n != i) {
					soma+=i;
					System.out.print(i);
					System.out.print(" ");
				}
			}
			System.out.println();
			System.out.println("A soma dos divisores de "+n+" �: "+soma);
			if(soma == n) {
				System.out.println("O n�mero "+n+" � um n�mero perfeito.");
			}else {
				System.out.println("O n�mero "+n+" n�o � um n�mero perfeito.");				
			}
			
		}
		
		entrada.close();
		
	}
	
}

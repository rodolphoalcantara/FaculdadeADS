package ListaDeExercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	
		// 		5. Fazer um algoritmo que leia um valor L e calcula a �rea de um quadrado de lado L
		
		Scanner entrada = new Scanner(System.in);
		int L;
		
		System.out.println("�rea do quadrado!");
		System.out.println("Insira o valor do lado do quadrado: ");
		L = entrada.nextInt();
		
		
		System.out.println("A �rea do quadrado �: "+ (L*L));
		
		
		
		
		entrada.close();
		
	}

}

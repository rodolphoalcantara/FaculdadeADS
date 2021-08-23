package ListaDeExercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	
		// 		4. Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números. (Por
		//		exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2. –8 é consecutivo
		//		de –9)
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Números consecutivos!");
		System.out.println("Insira o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.println("Insira o segundo número: ");
		n2 = entrada.nextInt();
		
		System.out.println("O número consecutivo de " +n1+ " é " +(n1+1));
		System.out.println("O número consecutivo de " +n2+ " é " +(n2+1));
		
		
		
		
		entrada.close();
		
	}

}

package ListaDeExercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	
		// 		4. Fazer um algoritmo que l� dois n�meros inteiros e imprime os n�meros consecutivos desses n�meros. (Por
		//		exemplo: se o usu�rio digitar 2 e -9, a sa�da dever� ser 3 e -8, porque 3 � consecutivo de 2. �8 � consecutivo
		//		de �9)
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("N�meros consecutivos!");
		System.out.println("Insira o primeiro n�mero: ");
		n1 = entrada.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		n2 = entrada.nextInt();
		
		System.out.println("O n�mero consecutivo de " +n1+ " � " +(n1+1));
		System.out.println("O n�mero consecutivo de " +n2+ " � " +(n2+1));
		
		
		
		
		entrada.close();
		
	}

}

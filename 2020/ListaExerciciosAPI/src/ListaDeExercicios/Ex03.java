package ListaDeExercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
		// 3. Fazer um algoritmo que l� dois n�meros e imprime a soma dos quadrados dos dois n�meros. O quadrado
		// de um n�mero A � representado por A2 = A * A.
		
		Scanner entrada = new Scanner(System.in);
		double n1, n2, resultado;
		
		System.out.println("Soma dos quadrados!");
		System.out.println("Insira o primeiro n�mero: ");
		n1 = entrada.nextDouble();
		System.out.println("Insira o segundo n�mero: ");
		n2 = entrada.nextDouble();
		
		resultado = Math.pow(n1, 2) + Math.pow(n2, 2);
		
		System.out.println("O resultado das somas dos quadrados dos n�mero " +n1+ " e " +n2+ " � igual a: " +resultado);
		
		
		
		
		entrada.close();
		
	}

}

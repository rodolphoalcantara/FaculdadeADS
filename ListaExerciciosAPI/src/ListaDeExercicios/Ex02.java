package ListaDeExercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		// 2. 	Fazer um algoritmo que l� dois n�meros, a base e o expoente, e imprime a pot�ncia (base elevada ao
		//		expoente). Dica: use a fun��o matem�tica Math.pow(). Exemplo: 5 elevado ao cubo ficaria
		//		Math.pow(5, 3). Voc� pode trocar esses n�meros por vari�veis.
		
		Scanner entrada = new Scanner(System.in);
		double n1, n2, resultado;
		
		System.out.println("Potencia��o!");
		System.out.println("Insira o n�mero correspondente a base: ");
		n1 = entrada.nextDouble();
		System.out.println("Insira o n�mero correspondente ao expoente: ");
		n2 = entrada.nextDouble();
		
		resultado = Math.pow(n1, n2);
		
		System.out.println("O resultado do n�mero " +n1+ " elevado a " +n2+ " � igual a: " +resultado);
		
		
		
		
		entrada.close();
		
	}

}

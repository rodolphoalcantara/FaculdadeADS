package ListaDeExercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		// 2. 	Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
		//		expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
		//		Math.pow(5, 3). Você pode trocar esses números por variáveis.
		
		Scanner entrada = new Scanner(System.in);
		double n1, n2, resultado;
		
		System.out.println("Potenciação!");
		System.out.println("Insira o número correspondente a base: ");
		n1 = entrada.nextDouble();
		System.out.println("Insira o número correspondente ao expoente: ");
		n2 = entrada.nextDouble();
		
		resultado = Math.pow(n1, n2);
		
		System.out.println("O resultado do número " +n1+ " elevado a " +n2+ " é igual a: " +resultado);
		
		
		
		
		entrada.close();
		
	}

}

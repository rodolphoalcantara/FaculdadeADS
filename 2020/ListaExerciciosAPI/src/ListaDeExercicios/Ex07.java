package ListaDeExercicios;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	
		/* 		7. Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do triângulo.
				Para esse caso, considere que (equação). Dica: nesse programa, você deve usar a
				função matemática Math.sqrt(). Por exemplo, a raiz de 121 ficaria Math.sqrt(121).

		*/

		
		Scanner entrada = new Scanner(System.in);
		double a,b;
		
		System.out.println("Hipotenusa!");
		
		System.out.println("Insira o valor do primeiro número: ");
		a = entrada.nextDouble();
		System.out.println("Insira o valor do segundo número: ");
		b = entrada.nextDouble();
		
		double resultado = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		
		
		System.out.println("O valor da hipotenusa é: "+resultado);
		
		
		
		
		
		entrada.close();
		
	}

}

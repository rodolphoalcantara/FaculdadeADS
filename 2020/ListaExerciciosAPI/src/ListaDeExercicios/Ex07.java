package ListaDeExercicios;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	
		/* 		7. Fazer um algoritmo que leia os dois lados A e B de um tri�ngulo ret�ngulo e calcula a hipotenusa do tri�ngulo.
				Para esse caso, considere que (equa��o). Dica: nesse programa, voc� deve usar a
				fun��o matem�tica Math.sqrt(). Por exemplo, a raiz de 121 ficaria Math.sqrt(121).

		*/

		
		Scanner entrada = new Scanner(System.in);
		double a,b;
		
		System.out.println("Hipotenusa!");
		
		System.out.println("Insira o valor do primeiro n�mero: ");
		a = entrada.nextDouble();
		System.out.println("Insira o valor do segundo n�mero: ");
		b = entrada.nextDouble();
		
		double resultado = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		
		
		System.out.println("O valor da hipotenusa �: "+resultado);
		
		
		
		
		
		entrada.close();
		
	}

}

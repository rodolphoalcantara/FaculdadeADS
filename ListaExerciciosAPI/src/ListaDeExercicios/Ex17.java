package ListaDeExercicios;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
	
		/* 		17. Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a vari�vel A for par escrever a mensagem "Valores aceitos", sen�o escrever "Valores n�o aceitos".
		*/

		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("Comparando n�meros ! :S");
		
		System.out.println("Insira o primeiro n�mero: ");
		a = entrada.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		b = entrada.nextInt();
		System.out.println("Insira o terceiro n�mero: ");
		c = entrada.nextInt();
		System.out.println("Insira o quarto n�mero: ");
		d = entrada.nextInt();
		
		if(b>c && d>a && (c+d)>(a+b) && c>0 && d>0 && a%2 == 0) {
			System.out.println("Valores aceitos !");
		} else {
			System.out.println("Valores n�o aceitos");
		}
		
		
		
		entrada.close();
		
	}

}

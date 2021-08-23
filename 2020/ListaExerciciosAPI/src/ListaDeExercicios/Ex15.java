package ListaDeExercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
	
		/* 		15. Leia 3 n�meros decimais A, B e C e efetue o c�lculo das ra�zes da equa��o de Bhaskara.
		*/

		
		Scanner entrada = new Scanner(System.in);
		
		double a,b,c;
		
		System.out.println("Bhaskara! :'( ");
		
		System.out.println("Insira o primeiro n�mero: ");
		a = entrada.nextDouble();
		System.out.println("Insira o segundo n�mero: ");
		b = entrada.nextDouble();
		System.out.println("Insira o terceiro n�mero: ");
		c = entrada.nextDouble();
		
		double delta = (b*b)+(-1*4)*a*c;
		
		double eq1 = (-b + Math.sqrt(delta))/(2*a);
		
		double eq2 = (-b - Math.sqrt(delta))/(2*a); 
		
		
		if(a<=0 || delta < 0) { 
			System.out.println("Imposs�vel calcular!");
			System.out.println(delta);
		}else {
			System.out.println("o valor do x' �: "+eq1);
			System.out.println("o valor do x'' �: "+eq2); }

		
		
		entrada.close();
		
	}

}

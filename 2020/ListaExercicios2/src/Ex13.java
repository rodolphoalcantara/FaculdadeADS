import java.util.Scanner;

public class Ex13 {
	
	/*
	 * 13. Fa�a um programa que leia um n�mero natural N e calcule a soma abaixo
	 * (lembre-se de que tanto as divis�es quanto o resultado devem ser decimais).
	 * Utilize o la�o que lhe for mais conveniente.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double soma=1;
		double dvsr=1.0, dvdnd=1.0;
		
		System.out.println("Calculadora de equa��es.");
		System.out.println("Dada a equa��o:");
		System.out.println("S = n/2n-1 + (n*(n+1))/(2n-1)*(2n-1) + ...");
		System.out.println("Insira um n�mero: ");
		int n = entrada.nextInt();
		
		if(n >= 0) {
			for (int i = 1; i < n; i++) {
				double div = 1;
				for (int j = 1; j <= i; j++) {
					
					dvdnd = j+1;
					//System.out.println("Dvd: "+dvdnd);
					dvsr = (2*dvdnd)-1;
					//System.out.println("Dvsr: "+dvsr);
					div *= (dvdnd/dvsr);
					//System.out.println("Div: "+div);
				}	
				soma += div;
				//System.out.println("soma "+soma);
			}
			
			
			System.out.println("O resultado da equa��o acima �: ");
			System.out.println(soma);
		}else {
			System.out.println("N deve ser um n�mero Natural.");
		}
		entrada.close();
		
	}
	
}


public class Ex10 {
	
	/*
	 * 10. Faça um programa que calcule e imprima o resultado da soma abaixo
	 * (lembre-se de que tanto as divisões quanto o resultado devem ser decimais).
	 * Utilize o laço que lhe for mais conveniente.
	 * 
	 * S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/20
	 * 
	 */
			
	public static void main(String[] args) {
		  double soma = 0, div;
		  
		  	System.out.println("Calculadora de equações.");
			System.out.println("Dada a equação:");
			System.out.println("S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/20");
		  for (int i = 1; i <= 20; i++) { 
			  div = 1.0/i;
			  soma += div;
		  }
		  
		  System.out.println("O resultado é: " + soma);
		 
	}
	
}

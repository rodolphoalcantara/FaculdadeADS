import java.util.Scanner;

public class Ex12 {
	
	/*
	 * 12. Faça um programa que leia um número natural N e calcule a soma abaixo
	 * (lembre-se de que tanto as divisões quanto o resultado devem ser decimais).
	 * Utilize o laço que lhe for mais conveniente.
	 * 
	 */
				
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double res = 0;
		
		System.out.println("Calculadora de equações.");
		System.out.println("Dada a equação:");
		System.out.println("S = 1/N + 2/(N-1) + 3/(N-2) +...+ (N-1)/2 + N/1");
		System.out.print("Insira um número natural: ");
		int n = entrada.nextInt();
		if(n>=0) {
			
			for (int i = 0; i < n; i++) {
				res += (1+i)/(n-i);
				//System.out.println((1+i)+"/"+(n-i));
				//System.out.println("(1+"+i+")/("+n+"-"+i+")");
			}
			for (int i = n; i > 0 ; i--) {
				res += (n-(i-1))/(i);
				//System.out.println((n-(i-1))+"/"+i);
				//System.out.println("("+n+"-"+(i-1)+")/("+i+")");
			}
			
			System.out.println("O resultado é: " + res);
			
			
		}else {
			System.out.println("N deve ser um número Natural.");
		}
		
		entrada.close();
		
	}
	
}

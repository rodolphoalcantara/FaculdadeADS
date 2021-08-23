import java.util.Scanner;

public class Ex12 {
	
	/*
	 * 12. Fa�a um programa que leia um n�mero natural N e calcule a soma abaixo
	 * (lembre-se de que tanto as divis�es quanto o resultado devem ser decimais).
	 * Utilize o la�o que lhe for mais conveniente.
	 * 
	 */
				
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double res = 0;
		
		System.out.println("Calculadora de equa��es.");
		System.out.println("Dada a equa��o:");
		System.out.println("S = 1/N + 2/(N-1) + 3/(N-2) +...+ (N-1)/2 + N/1");
		System.out.print("Insira um n�mero natural: ");
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
			
			System.out.println("O resultado �: " + res);
			
			
		}else {
			System.out.println("N deve ser um n�mero Natural.");
		}
		
		entrada.close();
		
	}
	
}

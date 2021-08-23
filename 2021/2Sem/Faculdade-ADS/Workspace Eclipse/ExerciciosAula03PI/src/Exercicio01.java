import java.util.Scanner;

public class Exercicio01 {
	
	//Dados 3 valores reais (float ou double) imprimir o valor do produto destes valores;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor de N1: ");
		double n1 = entrada.nextDouble();
		
		System.out.println("Entre com o valor de N2: ");
		double n2 = entrada.nextDouble();
		
		System.out.println("Entre com o valor de N3: ");
		double n3 = entrada.nextDouble();
		
		double resultado = n1*n2*n3;
		
		System.out.println("O produto dos números inseridos é: "+ resultado);
		
		entrada.close();
	}

}

package ListaDeExercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
	
		/* 		10. Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele no m�s (em dinheiro). 
		  		Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, calcular e imprimir o total a receber no final do m�s.

		*/

		
		Scanner entrada = new Scanner(System.in);
		String nomeVendedor;
		double salario, vendas, salarioFinal;
		
		System.out.println("Sal�rio total do Vendedor!");
		
		System.out.println("Insira o nome do vendedor: ");
		nomeVendedor = entrada.next();
		System.out.println("Insira o salario do vendedor: ");
		salario = entrada.nextDouble();
		System.out.println("Insira o valor total de vendas deste vendedor: ");
		vendas = entrada.nextDouble();
		
		salarioFinal = salario + vendas * 0.15;
		
		System.out.println("O sal�rio total do vendedor "+nomeVendedor+" � : " + salarioFinal);
		
		
		
		
		entrada.close();
		
	}

}

package ListaDeExercicios;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
	
		/* 		9. Escreva um programa que leia o n�mero de cadastro de um funcion�rio, seu n�mero de horas trabalhadas,
				o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre na tela o n�mero e o
				sal�rio do funcion�rio.

		*/

		
		Scanner entrada = new Scanner(System.in);
		int numeroCadastro,horasTrabalhadas;
		double valorHora;
		
		System.out.println("Sal�rio do Funcion�rio");
		
		System.out.println("Insira o n�mero de cadastro do funcion�rio: ");
		numeroCadastro = entrada.nextInt();
		System.out.println("Insira a quantidade de horas trabalhadas: ");
		horasTrabalhadas = entrada.nextInt();
		System.out.println("Insira o valor da hora de trabalho: ");
		valorHora = entrada.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.println("O sal�rio do funcion�rio de cadastro "+numeroCadastro+" �: "+ salario);
		
		
		
		
		
		entrada.close();
		
	}

}

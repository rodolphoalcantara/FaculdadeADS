package ListaDeExercicios;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
	
		/* 		9. Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas trabalhadas,
				o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o número e o
				salário do funcionário.

		*/

		
		Scanner entrada = new Scanner(System.in);
		int numeroCadastro,horasTrabalhadas;
		double valorHora;
		
		System.out.println("Salário do Funcionário");
		
		System.out.println("Insira o número de cadastro do funcionário: ");
		numeroCadastro = entrada.nextInt();
		System.out.println("Insira a quantidade de horas trabalhadas: ");
		horasTrabalhadas = entrada.nextInt();
		System.out.println("Insira o valor da hora de trabalho: ");
		valorHora = entrada.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.println("O salário do funcionário de cadastro "+numeroCadastro+" é: "+ salario);
		
		
		
		
		
		entrada.close();
		
	}

}

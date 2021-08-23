import java.util.Scanner;

public class Ex06 {
	
	//6. Faça um programa para ler e escrever dados de uma turma de 5 alunos. O programa deve pedir dados como
	//nome, idade e sexo. O programa deve imprimir os dados do aluno mais velho. Use o laço DO-WHILE.
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome, sexo, nomeF = "", sexoF = "";
		int idade, idadeF = 0, contador = 1;
		
		do {
			System.out.println("Insira o nome do " +contador+ "o Aluno: ");
			nome = entrada.next();
			System.out.println("Insira o idade do " +contador+ "o Aluno: ");
			idade = entrada.nextInt();
			System.out.println("Insira o sexo do " +contador+ "o Aluno: ");
			sexo = entrada.next();
			
			if(idade > idadeF) {
				idadeF = idade;
				nomeF = nome;
				sexoF = sexo;
			}
			
			contador++;
						
		}while(contador <= 5);
		
		System.out.println("Os dados do aluno mais velho são: ");
		System.out.println("Nome: " + nomeF);
		System.out.println("Idade: " + idadeF +" anos.");
		System.out.println("Sexo: " + sexoF);
		
		
		entrada.close();
				
	}
	
	
}

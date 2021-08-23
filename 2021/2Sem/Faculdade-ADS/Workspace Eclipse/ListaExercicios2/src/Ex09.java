import java.util.Scanner;

public class Ex09 {
	
	/*
	 * 9. Escreva um programa para ler a quantidade de alunos existentes em uma
	 * turma. Depois disso, o programa deve ler as notas de cada um destes alunos,
	 * calcular e mostrar na tela a m�dia aritm�tica destas notas. Utilize o la�o
	 * WHILE.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qntAluno, contador = 1, qtdNotas = 0;
		double media,somaNotas =0, nota;
		
		
		System.out.println("Insira quantos alunos existem na sala: ");
		qntAluno = entrada.nextInt();
		
		while(contador <= qntAluno) {
			
			System.out.println("Insira a nota do "+contador+"o Aluno.");
			nota = entrada.nextInt();
			
			if(nota>=0 && nota <=10) {
				somaNotas += nota;
				qtdNotas++;
				contador++;
			}else {
				System.out.println("Nota inv�lida, tente novamente.");
			}
		}
		media = somaNotas/qtdNotas;
		
		System.out.println("A m�dia das notas dos alunos �: "+media);
		
		entrada.close();
	}
	
	
}

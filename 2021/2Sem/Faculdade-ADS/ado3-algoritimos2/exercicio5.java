package exercicios;

public class exercicio5 {

	/*
	 * 
	 *Alunos: Aurélio Bispo dos Santos, Gessione Freitas de Souza, Rodolpho Ramos de Alcântara
	 * 
	 * 
	 * 
	 * Temos triângulos feito de blocos.   
	 * A linha superior tem 1 bloco, a próxima linha abaixo tem 2 blocos, apróxima linha tem 3 blocos e assim por diante. 
	 * Criar uma função recursiva que calcule (sem loops ou multiplicação)o número total de blocos em um triângulo com o número especificado de linhas.
	 * 
	 * Exemplos:
	 * triangulo(0)→0
	 * triangulo(1)→1
	 * triangulo(2)→3
	*/
		
	public static void main(String[] args) {
		
		System.out.println(triangulo(0));	
		System.out.println(triangulo(1));
		System.out.println(triangulo(2));	
	}
	
	public static int triangulo(int n) {
		
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}else {
			return n + triangulo(n-1);
		}
	}
}

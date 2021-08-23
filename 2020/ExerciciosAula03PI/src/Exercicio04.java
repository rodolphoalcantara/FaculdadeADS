import java.util.Scanner;

public class Exercicio04 {
	
	
	public static void main(String[] args) {
		//Dado um nome (String) não composto, imprimir a quantidade de caracteres deste nome.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira seu primeiro nome: ");
		String nome = entrada.next();
		
		System.out.println(nome.length());
		
		entrada.close();
		
	}
	
}

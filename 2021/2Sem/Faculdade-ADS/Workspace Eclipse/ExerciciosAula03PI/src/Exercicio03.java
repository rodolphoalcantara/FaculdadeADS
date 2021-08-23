import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//Dado um valor inteiro de 1 até 10, imprimir a “tabela” da tabuada deste valor;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um número entre 1 e 10: ");
		int n = entrada.nextInt();
		
		if(n >= 1 && n <= 10) {
			System.out.println(n + " x 0 = " + n*0);
			System.out.println(n + " x 1 = " + n*1);
			System.out.println(n + " x 2 = " + n*2);
			System.out.println(n + " x 3 = " + n*3);
			System.out.println(n + " x 4 = " + n*4);
			System.out.println(n + " x 5 = " + n*5);
			System.out.println(n + " x 6 = " + n*6);
			System.out.println(n + " x 7 = " + n*7);
			System.out.println(n + " x 8 = " + n*8);
			System.out.println(n + " x 9 = " + n*9);
			System.out.println(n + " x 10 = " + n*10);
		}else {
			System.out.println("Número inválido. Maior que 10 ou menor que 1 !");
		}
		
		entrada.close();
	
	
	}
	
}

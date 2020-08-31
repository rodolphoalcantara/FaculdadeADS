import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		//Dado um valor inteiro N imprimir os 3 primeiros múltiplos deste valor;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int n = entrada.nextInt();
		
		System.out.println(n+" x 0 = "+ n*0);
		System.out.println(n+" x 1 = "+ n*1);
		System.out.println(n+" x 2 = "+ n*2);
		
		entrada.close();
		
	}
	
	
}

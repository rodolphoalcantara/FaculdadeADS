import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/*
		 * Uma loja oferece para seus clientes um desconto de acordo com o valor da
		 * compra. Este desconto é de 20% se o valor da compra for maior ou igual a R$
		 * 300,00 e 15% se for menor. Dado o valor do produto, mostre o valor (descontado)
		 * da compra do cliente e o valor do desconto obtido;
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor do produto: ");
		double compra = entrada.nextDouble();
		double desc;
		
		if (compra >= 300.0) {
			desc = compra * 0.2;
			compra -= desc;
		}else {
			desc = compra * 0.15;
			compra -= desc;
		}
		
		System.out.println("O valor final da compra é de " + compra + " reais.");
		System.out.println("Seu desconto foi de " + desc + " reais.");
		entrada.close();
		
	}

}

import java.util.Scanner;

public class Ex20 {
	
	
	/*
	 * 20. Escreva um programa capaz de ler o saldo inicial de uma conta banc�ria e
	 * um n�mero indeterminado de opera��es de dep�sito e saque. O usu�rio deve
	 * digitar �1� para realizar um dep�sito, �2� para realizar um saque. Ap�s
	 * digitar o c�digo da opera��o, o usu�rio deve digitar o valor. As opera��es
	 * devem continuar sendo realizadas at� que o usu�rio digite o c�digo de
	 * opera��o �3�. Ao digitar �3�, o programa deve ser encerrado e o saldo final
	 * da conta deve ser impresso com as seguintes mensagens: CONTA ZERADA (caso o
	 * saldo final seja 0), CONTA ESTOURADA (se o saldo for negativo) ou CONTA
	 * PREFERENCIAL (se o saldo for positivo). Utilize o la�o DO-WHILE.
	 */
	 
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean sair = false;
		double valor= 0.0;
		System.out.print("Insira o saldo inicial da conta: ");
		double saldo = entrada.nextDouble();
		do {
			System.out.println("Escolha a opera��o a ser realizada: ");
			System.out.println("1. Dep�sito");
			System.out.println("2. Saque");
			System.out.println("3. Sair");
			int menu = entrada.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("Insira o valor a ser depositado:");
				valor = entrada.nextDouble();
				saldo += valor;
				System.out.println("Dep�sito realizado.");
				break;
			case 2:
				System.out.print("Insira o valor a ser sacado:");
				valor = entrada.nextDouble();
				saldo -= valor;
				System.out.println("Saque realizado.");
				break;
			case 3:
				System.out.println("Obrigado por utilizar o sistema.");
				sair = true;
				break;
			}
			
		}while(!sair);
		
		System.out.println("Saldo final da conta: "+saldo);
		if(saldo>0) {
			System.out.println("CONTA POSITIVA");			
		}else if(saldo<0) {
			System.out.println("CONTA NEGATIVA");			
		}else {
			System.out.println("CONTA ZERADA");
		}
		
		System.out.println("Finalizando aplica��o...");
		
		
		entrada.close();
		
	}
	
}

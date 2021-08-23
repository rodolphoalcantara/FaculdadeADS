import java.util.Scanner;

public class Ex19 {
	
	/*
	 * 19. Escreva um programa que repita a leitura de uma senha at� que ela seja
	 * v�lida. Para cada leitura de senha incorreta informada, escrever a mensagem
	 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
	 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
	 * correta � o valor 2002. Utilize o la�o que lhe for mais conveniente.
	 */
	public static void main(String[] args) {
		boolean permitido = false;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Autentica��o.");
		
		do {
			System.out.println("Por favor, insira a senha: ");
			int senha = entrada.nextInt();
			if(senha==2002) {
				System.out.println("Acesso Permitido");
				permitido = true;
			}else {
				System.out.println("Senha Invalida");
			}
						
		}while(!permitido);
		System.out.println("Encerrando aplica��o...");
		entrada.close();
		
	}
	
}

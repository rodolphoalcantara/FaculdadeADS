import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maxTentativas = 5, tentativa = 0;
		Random sorteador = new Random();
		int nSorteado = sorteador.nextInt(100)+1;
		
		System.out.println("Jogo da Adivinhação!");
		System.out.println("Iremos sortear um número de 1 a 100, e você terá 5 chances para acertar");
		//para testes
		System.out.println("Numero sorteado: "+nSorteado);
		for (int t = 0; t < maxTentativas; t++) {
			System.out.println("Faça sua "+(tentativa+1)+"o tentativa: ");

			int chute = entrada.nextInt();
			if(chute == nSorteado) {
				System.out.println("Parabéns, você ganhou o jogo!");
				break;
			}else if(chute == (nSorteado+1) || chute == (nSorteado-1)) {
				System.out.println("Tá quente!");
				tentativa++;
				if(chute < nSorteado) {
					System.out.println("O valor digitado é menor que o sorteado!");
					System.out.println();
				}else {
					System.out.println("O valor digitado é maior que o sorteado!");
					System.out.println();
				}
			}else {
				System.out.println("Você errou!");
				tentativa++;
				if(chute < nSorteado) {
					System.out.println("O valor digitado é menor que o sorteado!");
					System.out.println();
				}else {
					System.out.println("O valor digitado é maior que o sorteado!");
					System.out.println();
				}
			}
		}
		if(tentativa == maxTentativas) {
			System.out.println("Game Over!");
			System.out.print("O valor sorteado foi: ");
			System.out.println(nSorteado);
		}
		System.out.println("Obrigado por participar!");
		entrada.close();
		
	}

}
import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maxTentativas = 5, tentativa = 0;
		Random sorteador = new Random();
		int nSorteado = sorteador.nextInt(100)+1;
		
		System.out.println("Jogo da Adivinha��o!");
		System.out.println("Iremos sortear um n�mero de 1 a 100, e voc� ter� 5 chances para acertar");
		//para testes
		System.out.println("Numero sorteado: "+nSorteado);
		for (int t = 0; t < maxTentativas; t++) {
			System.out.println("Fa�a sua "+(tentativa+1)+"o tentativa: ");

			int chute = entrada.nextInt();
			if(chute == nSorteado) {
				System.out.println("Parab�ns, voc� ganhou o jogo!");
				break;
			}else if(chute == (nSorteado+1) || chute == (nSorteado-1)) {
				System.out.println("T� quente!");
				tentativa++;
				if(chute < nSorteado) {
					System.out.println("O valor digitado � menor que o sorteado!");
					System.out.println();
				}else {
					System.out.println("O valor digitado � maior que o sorteado!");
					System.out.println();
				}
			}else {
				System.out.println("Voc� errou!");
				tentativa++;
				if(chute < nSorteado) {
					System.out.println("O valor digitado � menor que o sorteado!");
					System.out.println();
				}else {
					System.out.println("O valor digitado � maior que o sorteado!");
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
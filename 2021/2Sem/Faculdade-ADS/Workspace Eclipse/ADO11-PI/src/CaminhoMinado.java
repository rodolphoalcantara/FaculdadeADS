import java.util.Random;
import java.util.Scanner;

//-1 = bomba
// 0 = posição livre
// 1 = posição livre já escolhida

public class CaminhoMinado {
	public static void main(String[] args) {
		int tamCaminho, nBombas, nGerado, passo;
		boolean saida = false, bomba = false;
		Scanner input = new Scanner(System.in);
		Random gerador = new Random();

		System.out.println("Informe o tamanho do caminho a ser percorrido: ");
		System.out.println("Obs.: Esse número deve ser maior que 1");
		tamCaminho = input.nextInt();

		do {
			System.out.println("Agora informe a quantidade de bombas: ");
			System.out.println("Obs.: Deve haver pelo menos uma bomba no caminho!");
			nBombas = input.nextInt();
			if (nBombas < tamCaminho) {
				bomba = true;
			}
		} while (!bomba);

		int[] caminho = new int[tamCaminho];
		for (int i = 0; i < caminho.length; i++) {
			caminho[i] = 0;
		}

		for (int i = 0; i < nBombas;) {
			nGerado = gerador.nextInt(tamCaminho) + 1;
			if (caminho[i] != -1) {
				caminho[nGerado] = -1;
				i++;
			}
		}
		do {
			for (int i = 0; i < caminho.length;) {
				for (int j = 0; j < caminho.length; j++) {
					if (caminho[j] == 0 || caminho[j] == -1) {
						System.out.println(j + ". _");
					} else {
						System.out.println(j + ". x");
					}
				}

				System.out.println("Escolha seu próximo passo: ");
				passo = input.nextInt();
				i = caminho[passo];
				if (passo < tamCaminho) {
					switch (caminho[passo]) {
					case -1:

						System.out.println("GAME OVER !!");
						saida = true;
						break;
					case 0:
						caminho[passo] = 1;
						break;
					case 1:
						System.out.println("Você não pode voltar no mesmo passo!");
						break;

					default:
						System.out.println("Passo inválido !");
						break;
					}
				}

			}

		} while (!saida);

		// teste
		/*
		 * System.out.println("tam array: " + caminho.length);
		 * System.out.println("conteudo: "); for (int i : caminho) {
		 * System.out.println(i); }
		 */
		input.close();
	}
}

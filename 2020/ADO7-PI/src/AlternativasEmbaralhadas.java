import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlternativasEmbaralhadas {
	public static void main(String[] args) {
		boolean podeSair = false;
		ArrayList<String> alternativas = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in);
		String a, b, c, d, e;
		String resposta;

		alternativas.add("Somando os termos.");
		alternativas.add("Multiplicando os monomios.");
		alternativas.add("Multiplicando os expoentes dos termos");
		alternativas.add("Somando os expoentes dos termos, a maior soma será o grau.");
		alternativas.add("Multiplicando os elementos de cada termo, o maior produto será o grau.");
		
		do {
			ArrayList<String> alternativasEmbaralhadas = new ArrayList<String>();

			Collections.shuffle(alternativas);
			System.out.println("Como podemos definir o grau de um polinomio?");

			for (int i = 0; i < alternativas.size(); i++) {
				alternativasEmbaralhadas.add(alternativas.get(i));

			}

			a = "a. " + alternativasEmbaralhadas.get(0);
			b = "b. " + alternativasEmbaralhadas.get(1);
			c = "c. " + alternativasEmbaralhadas.get(2);
			d = "d. " + alternativasEmbaralhadas.get(3);
			e = "e. " + alternativasEmbaralhadas.get(4);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);

			System.out.println("Escolha a letra correspondente a resposta correta: ");
			String altEscolhida = entrada.next();

			switch (altEscolhida.toLowerCase()) {
			case "a":
				resposta = a;
				break;
			case "b":
				resposta = b;
				break;
			case "c":
				resposta = c;
				break;
			case "d":
				resposta = d;
				break;
			case "e":
				resposta = e;
				break;
			default:
				
				resposta = "";
				break;
			}

			if (resposta.contains("Somando os expoentes dos termos, a maior soma será o grau.")) {
				System.out.println("Resposta Correta!");
				podeSair = true;
			} else if(resposta == "") {
				System.err.println("Alternativa inserida incorretamente!");
				System.out.println();
			}else {
				System.out.println("Resposta Incorreta!");
				System.out.println();
			}

		} while (!podeSair);
		
		System.out.println("Finalizando aplicação...");
	}
}

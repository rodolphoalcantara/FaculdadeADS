package sp.senac.br.dicionario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/*
 *Entrega do Trabalho 2-Algoritmos e Programação II
 *
 *Nós,
 *
 *Felipe Fabrini de Vilhena Moraes 
 *Gessione Freitas de Souza
 *Rodolpho Ramos de Alcântara
 *
 *declaramos que
 *
 *todas as respostas são fruto de nosso próprio trabalho,
 *não copiamos respostas de colegas externos à equipe,
 *não disponibilizamos nossas respostas para colegas externos ao grupo e
 *não realizamos quaisquer outras atividades desonestas para nos beneficiar ou 
 *prejudicar outros.
 */


public class Dicionario {

	public static void main(String[] args) throws IOException {

		//abertura do arquivo
		FileReader arquivo = new FileReader("arquivo.txt");
		BufferedReader buffer = new BufferedReader(arquivo);

		//criação do dicionario
		String[] dicionario = new String[1000];
		
		String linha;

		// leitura de linha por linha do arquivo
		while ((linha = buffer.readLine()) != null) {
			//criação de um vetor com todas as palavras da linha lida 
			String[] palavras = linha.split(" ");
			
			//para cada palavra é feita uma busca no dicionario e caso não haja a palavra é adicionada e ordenada.
			for (String palavra : palavras) {
				if (buscarPalavraNoDicionario(dicionario, palavra) == -1) {
					Boolean inseriu = inserirOrdenadoNoDicionario(dicionario, palavra);
					if (!inseriu) {
						System.out.println("Limite máximo do dicionario atingido!");
					}
				}
			}
		}
		
		//impressão do dicionario
		for (String palavra : dicionario) {
			if (palavra != null) {
				System.out.println(palavra);
			}
		}
	}

	//metodo de busca da palavra no dicionario
	static int buscarPalavraNoDicionario(String[] dicionario, String palavra) {
		int inicio = 0;
		int fim = dicionario.length - 1;
		int atual;

		while (inicio <= fim) {
			atual = (inicio + fim) / 2;

			if (dicionario[atual] == null || palavra.toLowerCase().compareTo(dicionario[atual].toLowerCase()) < 0) {
				fim = atual - 1;
			} else if (palavra.toLowerCase().compareTo(dicionario[atual].toLowerCase()) > 0) {
				inicio = atual + 1;
			} else if (palavra.toLowerCase().compareTo(dicionario[atual].toLowerCase()) == 0) {
				return atual;// retorna a posição da palavra
			}
		}
		return -1;
	}
	
	//metodo de inserção da palavra no dicionario
	static Boolean inserirOrdenadoNoDicionario(String[] dicionario, String palavra) {
		if (dicionario[dicionario.length - 1] != null)
			return false;

		int ultimaPosicao = 0;
		//procura a ultima posição com palavra para adicionar a palavra nova.
		for (int i = 0; i < dicionario.length; i++) {
			if (dicionario[i] == null) {
				dicionario[i] = palavra.toLowerCase();
				ultimaPosicao = i;
				break;
			}
		}
		//algoritmo de insertion sort
		for (int i = 0; i <= ultimaPosicao; i++) {
			int j = i;
			String aux = dicionario[j];

			while (j > 0 && aux.compareTo(dicionario[j - 1]) < 0) {
				dicionario[j] = dicionario[j - 1];
				j--;
			}
			dicionario[j] = aux;

		}
		return true;
	}
}

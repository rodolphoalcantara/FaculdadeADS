package br.sp.senac.ap2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*

Entrega de trabalho
N�s,

Gessione Freitas de Souza
Felipe Fabrini de Vilhena Moraes
Rodolpho Ramos de Alc�ntara

declaramos que
todas as respostas s�o fruto de nosso pr�prio trabalho,
n�o copiamos respostas de colegas externos � equipe,
n�o disponibilizamos nossas respostas para colegas externos � equipe e
n�o realizamos quaisquer outras atividades desonestas para nos beneficiar ou
prejudicar outros.

*/

public class ReconhecimentoDePadroes {

	public static void main(String[] args) throws IOException {

		//leitura do arquivo 1
		FileReader arquivo1 = new FileReader("arquivo1.txt");
		BufferedReader buffer = new BufferedReader(arquivo1);

		Double[][] matriz1 = geraMatriz(buffer);
		
		System.out.print("Caso 1: ");
		mostraCentroDeGravidade(matriz1);
		
		// ###############################################################
		
		//leitura do arquivo 2
		FileReader arquivo2 = new FileReader("arquivo2.txt");
		BufferedReader buffer2 = new BufferedReader(arquivo2);

		Double[][] matriz2 = geraMatriz(buffer2);
		
		System.out.print("Caso 2: ");
		mostraCentroDeGravidade(matriz2);
		
		arquivo1.close();
		arquivo2.close();
		buffer.close();
		buffer2.close();

	}

	static Double[][] geraMatriz(BufferedReader buffer) throws IOException {
		//recebe a primeira linha para usa-la como tamanho da matriz
		String[] str = buffer.readLine().split(" ");
		
		//caso a coluna ou a linha seja menor que 3 lan�a uma excess�o
		if (Integer.parseInt(str[0]) < 3 || Integer.parseInt(str[1]) < 3 ) {
			throw new IOException("A matriz precisa ter no minimo 3 linhas e 3 colunas");
		}
		
		Double[][] matriz = new Double[Integer.parseInt(str[0])][Integer.parseInt(str[1])];

		// para cada linha da matriz adiciona um array de double de acordo com oq foi lido na linha
		for (int i = 0; i < matriz.length; i++) {
			String[] strLine = buffer.readLine().split(" ");
			Double[] dbLine = new Double[strLine.length];
			for (int j = 0; j < strLine.length; j++) {
				//forma um array de double baseado no array de string que foi parseado
				dbLine[j] = Double.parseDouble(strLine[j]);
			}
			matriz[i] = dbLine;
		}
		return matriz;
	}

	//m�todo apenas imprime no console o resultado dos metodos descobreLinha e descobreColuna
	static void mostraCentroDeGravidade(Double[][] matriz) {

		int linha = descobreLinha(matriz);

		int coluna = descobreColuna(matriz);
		
		System.out.println("Centro ( "+linha+", "+coluna+" )");

	}

	static int descobreColuna(Double[][] matriz) {
		//Uma vari�vel como valor m�ximo para ser substitu�da por valores menores
		Double maiorDiferenca = Double.MAX_VALUE;
		int contador = 0;
		
		/// Percorre a Matriz pelas colunas,ignorando a primeira e a �ltima coluna
		/// "i" ser� nosso apontandor da coluna
		for (int i = 1; i <= (matriz[0].length-2); i++) {
			Double somaColunaEsquerda = 0.0;
			Double somaColunaDireita = 0.0;
			int colunaEsquerda = i-1;
			int colunaDireita = i+1;
			
			//Somando as colunas da esquerda da coluna "i" para fazer compara��o
			while(colunaEsquerda >= 0) {				
				for (int j = 0; j < matriz.length; j++) {
					somaColunaEsquerda += matriz[j][colunaEsquerda];
				}
				colunaEsquerda--;
			}
			//Somando as colunas da direita da coluna "i" para fazer compara��o
			while(colunaDireita < matriz[0].length) {
				for (int j = 0; j < matriz.length; j++) {
					somaColunaDireita += matriz[j][colunaDireita];
				}
				colunaDireita++;
			}
			
			//Verificando a diferen�a absoluta � menor que a diferen�a inicializada no come�o do metodo 
			if(Math.abs(somaColunaEsquerda-somaColunaDireita) < maiorDiferenca ) {
				maiorDiferenca = Math.abs(somaColunaEsquerda-somaColunaDireita);
				contador = i;
			}
			
		}
		//Retorna o contador que ser� a coluna "i" + 1, pois a matriz come�a em 0
		return contador+1;
	}

	static int descobreLinha(Double[][] matriz) {
		//Uma vari�vel como valor m�ximo para ser substitu�da por valores menores
		Double maiorDiferenca = Double.MAX_VALUE;
		int contador = 0;
		
		/// Percorre a Matriz pelas linhas,ignorando a primeira e a �ltima linha
		for (int i = 1; i <= (matriz.length - 2); i++) {
			/// "i" ser� nosso apontandor da linha
			Double somaLinhaCima = 0.0;
			Double somaLinhaBaixo = 0.0;
			int linhaCima = i-1;
			int linhaBaixo = i+1;
			
			//Somando as linhas de cima "i" para fazer compara��o
			while (linhaCima >= 0) {
				for (int j = 0; j < matriz[linhaCima].length; j++) {
					somaLinhaCima += matriz[linhaCima][j];
				}
				linhaCima--;
			}
			
			//Somando as linhas de baixo "i" para fazer compara��o
			while (linhaBaixo < matriz.length) {
				for (int j = 0; j < matriz[linhaBaixo].length; j++) {
					somaLinhaBaixo += matriz[linhaBaixo][j];
				}
				linhaBaixo++;
			}
			
			//Verificando a diferen�a absoluta � menor que a diferen�a inicializada no come�o do metodo 
			if(Math.abs(somaLinhaBaixo-somaLinhaCima) < maiorDiferenca ) {
				
				maiorDiferenca = Math.abs(somaLinhaCima-somaLinhaBaixo);		
				contador = i;
			}
			
		}

		//Retorna o contador que ser� a coluna "i" + 1, pois a matriz come�a em 0
		return contador+1;
	}
}

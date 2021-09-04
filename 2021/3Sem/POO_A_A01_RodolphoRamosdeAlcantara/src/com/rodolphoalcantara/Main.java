package com.rodolphoalcantara;
import java.util.List;

import com.rodolphoalcantara.helpers.CalculadorPib;
import com.rodolphoalcantara.helpers.GeradorDeArquivo;
import com.rodolphoalcantara.helpers.LeitorDeArquivos;
import com.rodolphoalcantara.models.Estado;
import com.rodolphoalcantara.models.Regiao;

/**
 * 
 * Classe main do projeto.
 * 
 * @author Rodolpho Ramos de Alcântara
 * @version 1.0 
 * Main Class File: Main.java
 * File: Main.java
 * Date: 24/08/2021
 */
public class Main {
    public static void main(String [] args) {
    	//setando variaveis
    	//listas 
    	List<Estado> estados = LeitorDeArquivos.leitorEstadosEPibs("assets/pib.txt");
    	List<Regiao> regioes = LeitorDeArquivos.leitorRegioes("assets/regioes.txt");
    	//total pib
    	double totalPibGeral = CalculadorPib.geraPibTotalGeral(estados);
    	//preenchendo pib da lista de regioes utilizando a lista de estados
    	regioes.stream().forEach(regiao -> regiao.preenchaPibsEstados(estados));
    	for (Regiao regiao : regioes) {
    		CalculadorPib.geraPibTotalPorRegiao(regiao);	
		}
    	
    	
    	//Imprimir na tela PIB por estado em relação ao total
    	System.out.println("PIB Total: "+totalPibGeral);
    	for(Regiao regiao : regioes) {
    	for (Estado estado : regiao.getEstados()) {
			System.out.println("Estado: "+estado.getNome()+" | PIB: "+ CalculadorPib.pibEmPorcentagem(estado.getPib(), totalPibGeral));
		}}
    	
    	
    	//gerando arquivo de saida
    	GeradorDeArquivo.criaArquivoSaida(regioes, "assets/saida.txt");
    	
    	
    }
}


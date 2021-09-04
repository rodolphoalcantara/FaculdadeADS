package com.rodolphoalcantara.helpers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.rodolphoalcantara.models.Estado;
import com.rodolphoalcantara.models.Regiao;


/**
 * 
 * Classe helper que contem a lógica para ler um arquivo que se encontra no root do projeto.
 * 
 * @author Rodolpho Ramos de Alcântara
 * @version 1.0 
 * Main Class File: Main.java
 * File: LeitorDeArquivos.java
 * Date: 24/08/2021
 */
public class LeitorDeArquivos {
	
	public LeitorDeArquivos() {
		throw new RuntimeException("Não é possível instanciar esta classe.");
	}
	
	public static List<Estado> leitorEstadosEPibs(String file){
		
		String line = null;
		List<Estado> estados = new ArrayList<Estado>();
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			
			while((line = br.readLine()) != null) {
				String[] valores = line.split(";");
				
				estados.add(new Estado(valores[0], Double.parseDouble(valores[1])));
			}
			
			br.close();			
			
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possível encontrar o aquivo '" + file + "'");    
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro ao tentar ler o arquivo '" + file + "'");    
			e.printStackTrace();
		}
		
		return estados;
	}
	
	public static List<Regiao> leitorRegioes(String file){
		
		String line = null;
		Regiao regiao = new Regiao();
		List<String> valores = new ArrayList<String>();
		List<Regiao> regioes = new ArrayList<Regiao>();
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
						
			while((line = br.readLine()) != null) {			
				valores.add(line);
			}
			
//			for (String valor : valores) {
//				System.out.print(valor + "; ");
//			}
			
			br.close();			
			
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possível encontrar o aquivo '" + file + "'");    
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro ao tentar ler o arquivo '" + file + "'");    
			e.printStackTrace();
		}

		int contadorInterno = 0;
		for(int i = 0; i < valores.size(); i++) {
			
			if(valores.get(i).trim().equals("")) {
				regioes.add(regiao);
			
				regiao = new Regiao();
				contadorInterno = 0;
				
			}else {
				if(contadorInterno == 0) {
					regiao.setNome(valores.get(i));
					contadorInterno++;
				}else {
					Estado estado = new Estado();
					estado.setNome(valores.get(i));
					regiao.getEstados().add(estado);
					if(i == valores.size() -1){
						regioes.add(regiao);
					}
				}
			}
		}
		
		return regioes;
	}

}

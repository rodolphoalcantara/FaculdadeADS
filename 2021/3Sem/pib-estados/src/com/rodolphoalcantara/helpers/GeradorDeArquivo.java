package com.rodolphoalcantara.helpers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.rodolphoalcantara.models.Regiao;

public class GeradorDeArquivo {

	public static void criaArquivoSaida(List<Regiao> regioes, String nomeArquivoSaida) {

		String arquivoDeSaida = nomeArquivoSaida;

		try {

			FileWriter fw = new FileWriter(arquivoDeSaida);

			BufferedWriter bw = new BufferedWriter(fw);

			for(Regiao regiao : regioes) {
				bw.write("PIB da regiao "+ regiao.getNome()+" = " + regiao.getPibTotal());
				bw.newLine();
			}

			bw.close();
		} catch (IOException ex) {
			System.out.println("Erro de escrita em '" + arquivoDeSaida + "'");
		}

	}

}

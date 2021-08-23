package com.rodolphoalcantara.helpers;

import java.text.DecimalFormat;
import java.util.List;

import com.rodolphoalcantara.models.Estado;
import com.rodolphoalcantara.models.Regiao;

public class CalculadorPib {
	
	public CalculadorPib() {
		throw new RuntimeException("Não é possível instanciar esta classe.");
	}
	
	
	public static double geraPibTotalPorRegiao(Regiao regiao) {
		
		double somaPibs = regiao.getEstados().stream().reduce(0.0, (subtotal, estado) -> subtotal + estado.getPib(), Double::sum);
		
		regiao.setPibTotal(somaPibs);
		
		return regiao.getPibTotal();
	}
	
	public static double geraPibTotalGeral(List<Estado> todosEstados) {
		
		return todosEstados.stream().mapToDouble(estado -> estado.getPib()).sum();
		
	}
	
	public static String pibEmPorcentagem(double pib, double totalGeral) {
		
		double porcentagem = pib/totalGeral;
		
		DecimalFormat df = new DecimalFormat("##.##%");
		
		return df.format(porcentagem);
	}

}

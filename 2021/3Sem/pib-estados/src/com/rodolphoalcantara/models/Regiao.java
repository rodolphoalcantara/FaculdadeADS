package com.rodolphoalcantara.models;

import java.util.ArrayList;
import java.util.List;


public class Regiao {
	
	private String nome;
	private List<Estado> estados;
	private double pibTotal;
	
	public Regiao() {
		this.estados = new ArrayList<Estado>();
	}
	
	
	public List<Estado> getEstados() {
		return estados;
	}
	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPibTotal() {
		return pibTotal;
	}
	public void setPibTotal(double pibTotal) {
		this.pibTotal = pibTotal;
	}
	
	public void preenchaPibsEstados(List<Estado> listaEstados){
		
		for (Estado estadoRegiao : this.estados) {
			for(Estado estadoLista : listaEstados) {
				if(estadoRegiao.getNome().trim().equals(estadoLista.getNome().trim())) {
					estadoRegiao.setPib(estadoLista.getPib());
					break;
				}
			}
		}
	}

}

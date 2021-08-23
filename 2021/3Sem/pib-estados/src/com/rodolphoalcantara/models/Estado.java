package com.rodolphoalcantara.models;

public class Estado {
	
	private String nome;
	private double pib;
	
	public Estado(String nome, double pib) {
		this.nome = nome;
		this.pib = pib;
	}
	
	public Estado() {}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPib() {
		return pib;
	}
	public void setPib(double pib) {
		this.pib = pib;
	}
	
}

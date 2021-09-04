package com.rodolphoalcantara.models;

/**
 * 
 * Classe modelo que representa o Estado.
 * 
 * @author Rodolpho Ramos de Alcântara
 * @version 1.0 
 * Main Class File: Main.java
 * File: Estado.java
 * Date: 24/08/2021
 */
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

package com.estrategit.modelo;

public class Caja {

	String NumeroSerie;
	String Estado;

	public Caja(String numeroSerie, String estado) {
		NumeroSerie = numeroSerie;
		Estado = estado;
	}

	public Caja() {
		super();
	}

	public String getNumeroSerie() {
		return NumeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		NumeroSerie = numeroSerie;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

}

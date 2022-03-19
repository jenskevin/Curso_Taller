package com.estrategit.herencia;

public class Producto {
	
	String NombreProducto;
	Integer Cantidad;
	Double Precio;
	
	

	public Producto(String nombreProducto, Integer cantidad, Double precio) {
		NombreProducto = nombreProducto;
		Cantidad = cantidad;
		Precio = precio;
	}


	public String getNombreProducto() {
		return NombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}


	public Double getPrecio() {
		return Precio;
	}


	public void setPrecio(Double precio) {
		Precio = precio;
	}


	public Integer getCantidad() {
		return Cantidad;
	}


	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}
	
	
	
	
	
	
	

}

package com.estrategit.modelo;

import com.estrategit.herencia.Cliente;
import com.estrategit.herencia.Producto;

public class FacturacionElectronica {

	String NumeroComprobante;
	String FechaEmision;
	Double Total;
	String ClaveAcceso;
	Cliente cliente;
	Producto producto;
	Caja caja;

	public FacturacionElectronica(String numeroComprobante, String fechaEmision, Double total, String claveAcceso) {
		NumeroComprobante = numeroComprobante;
		FechaEmision = fechaEmision;
		Total = total;
		ClaveAcceso = claveAcceso;
	}

	public FacturacionElectronica(String numeroComprobante, String fechaEmision, Double total, String claveAcceso,
			Cliente cliente, Producto producto, Caja caja) {
		NumeroComprobante = numeroComprobante;
		FechaEmision = fechaEmision;
		Total = total;
		ClaveAcceso = claveAcceso;
		this.cliente = cliente;
		this.producto = producto;
		this.caja = caja;
	}

	

	public String getNumeroComprobante() {
		return NumeroComprobante;
	}

	public void setNumeroComprobante(String numeroComprobante) {
		NumeroComprobante = numeroComprobante;
	}

	public String getFechaEmision() {
		return FechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		FechaEmision = fechaEmision;
	}

	public Double getTotal() {
		return Total;
	}

	public void setTotal(Double total) {
		Total = total;
	}

	public String getClaveAcceso() {
		return ClaveAcceso;
	}

	public void setClaveAcceso(String claveAcceso) {
		ClaveAcceso = claveAcceso;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}

}

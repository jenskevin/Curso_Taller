package com.estrategit.hilo;

import java.util.ArrayList;

import com.estrategit.herencia.Cliente;
import com.estrategit.herencia.Producto;
import com.estrategit.modelo.Caja;
import com.estrategit.modelo.FacturacionElectronica;

public class EjecutarHilo {
	
	public static void main(String[] args) {
		
		System.out.println("-------INICIA SENTENCIAS HILO MAIN------");
		Thread Caja = new Thread(
				new Runnable() {
					public void run() {
						for (int i = 0; i < 5; i++ ) {
							System.out.println("-------INICIA CAJA NUMERO 1------");
							ArrayList<FacturacionElectronica> listaString = new ArrayList<FacturacionElectronica>();
							FacturacionElectronica electronica = new FacturacionElectronica("1222365618868141415", "12/03/2022", 1.50, "1200551544541114546",
									 new Cliente("JENS KEVIN","0924459068"), new Producto("AGUA",1,1.50), new Caja("001-aaa","Activa"));
							
							listaString.add(electronica);
							System.out.println("CLAVE DE ACCESO:" + electronica.getClaveAcceso() + 
									"FECHA EMISION:" + electronica.getFechaEmision() +
									"NUMERO DE DOCUMENTO:" + electronica.getNumeroComprobante() +
									"NOMBRE CLIENTE:" + electronica.getCliente().getNombre() +
									"CEDULA:" + electronica.getCliente().getCedula() +
									"NOMBRE DEL PRODUCTO:"  + electronica.getProducto().getNombreProducto() +
									"CANTIDAD: " + electronica.getProducto().getCantidad() +
									"PRECIO :" + electronica.getProducto().getPrecio());

						
							System.out.println("------------------------------");
						}
					}
				}
				);
				
				
				Thread Caja1 = new Thread(
						new Runnable() {
							public void run() {
								for (int i = 0; i < 5; i++ ) {
									System.out.println("-------INICIA CAJA NUMERO 2------");
									ArrayList<FacturacionElectronica> listaString = new ArrayList<FacturacionElectronica>();
									FacturacionElectronica electronica = new FacturacionElectronica("1222365618868141415", "12/03/2022", 1.50, "1200551544541114546",
											 new Cliente("JENS KENNY","0924459068"), new Producto("AGUA",1,1.50), new Caja("002-aaa","Activa"));
									
									listaString.add(electronica);
									System.out.println("CLAVE DE ACCESO:" + electronica.getClaveAcceso() + 
											"FECHA EMISION:" + electronica.getFechaEmision() +
											"NUMERO DE DOCUMENTO:" + electronica.getNumeroComprobante() +
											"NOMBRE CLIENTE:" + electronica.getCliente().getNombre() +
											"CEDULA:" + electronica.getCliente().getCedula() +
											"NOMBRE DEL PRODUCTO:"  + electronica.getProducto().getNombreProducto() +
											"CANTIDAD: " + electronica.getProducto().getCantidad() +
											"PRECIO :" + electronica.getProducto().getPrecio());
		
								
									System.out.println("------------------------------");
								}
							}
						}
						);
				
				Thread Caja2 = new Thread(
						new Runnable() {
							public void run() {
								for (int i = 0; i < 5; i++ ) {
									System.out.println("-------INICIA CAJA NUMERO 3------");
									ArrayList<FacturacionElectronica> listaString = new ArrayList<FacturacionElectronica>();
									FacturacionElectronica electronica = new FacturacionElectronica("1222365618868141415", "12/03/2022", .50, "1200551544541114546",
											 new Cliente("MANUEL BASTIDAS","0924459068"), new Producto("COCA COLA",1,2.50), new Caja("003-aaa","Activa"));
									
									listaString.add(electronica);
									System.out.println("CLAVE DE ACCESO:" + electronica.getClaveAcceso() + 
											"FECHA EMISION:" + electronica.getFechaEmision() +
											"NUMERO DE DOCUMENTO:" + electronica.getNumeroComprobante() +
											"NOMBRE CLIENTE:" + electronica.getCliente().getNombre() +
											"CEDULA:" + electronica.getCliente().getCedula() +
											"NOMBRE DEL PRODUCTO:"  + electronica.getProducto().getNombreProducto() +
											"CANTIDAD: " + electronica.getProducto().getCantidad() +
											"PRECIO :" + electronica.getProducto().getPrecio());
		
								
									System.out.println("------------------------------");
								}
							}
						}
						);
			
		
		Caja.start();
		Caja1.start();
		Caja2.start();




	}

}

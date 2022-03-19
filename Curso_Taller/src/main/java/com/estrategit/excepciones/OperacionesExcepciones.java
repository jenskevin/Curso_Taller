package com.estrategit.excepciones;

public class OperacionesExcepciones extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String ERROR_AL_CALCULAR = "Error al Calcular";

	public static final String ERROR_GENERAL_DEL_SISTEMA = "Error general del sistema";

	public static final String CODIGO_DEFECTO = "000";
	
	private String codigoTecnico;
	private String mensaje;
	
	
	public OperacionesExcepciones() {
		super (CODIGO_DEFECTO + " - " + ERROR_GENERAL_DEL_SISTEMA);
		codigoTecnico = "000";
		mensaje = ERROR_GENERAL_DEL_SISTEMA;
	}
	
	
	public OperacionesExcepciones(String codigo) {
		super (codigo + " - " + ERROR_AL_CALCULAR);
		codigoTecnico = codigo;
		mensaje = ERROR_AL_CALCULAR;
	}
	
	public OperacionesExcepciones(String codigo, String mensaje) {
		super (codigo + " - " + mensaje);
		codigoTecnico = codigo;
		this.mensaje = mensaje;
	}
	


	public String getCodigoTecnico() {
		return codigoTecnico;
	}


	public void setCodigoTecnico(String codigoTecnico) {
		this.codigoTecnico = codigoTecnico;
	}


	
	
	
	
	
	

}

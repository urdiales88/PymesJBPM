package com.myteam.pruebafront;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DatosPrueba implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String nombre;
	private java.lang.String apellidoPaterno;
	private java.lang.String apellidoMaterno;
	public DatosPrueba() {
	}

	public java.lang.String getNombre() {
		return this.nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public java.lang.String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(java.lang.String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public java.lang.String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(java.lang.String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public DatosPrueba(java.lang.String nombre,
			java.lang.String apellidoPaterno, java.lang.String apellidoMaterno) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}

}
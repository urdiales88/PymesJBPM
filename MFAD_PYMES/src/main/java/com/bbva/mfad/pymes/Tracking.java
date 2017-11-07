package com.bbva.mfad.pymes;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Tracking implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String fecha;
	private java.lang.String etapa;
	private java.util.List<java.lang.String> documentosObservados;
	private java.lang.String tipificacion;
	private java.util.List<java.lang.String> subTipificacion;
	private java.lang.String tipo;
	private java.lang.String observacionesInternas;
	private java.lang.String observacionesExternas;
	private java.lang.String usuario;

	public Tracking() {
	}

	public java.lang.String getFecha() {
		return this.fecha;
	}

	public void setFecha(java.lang.String fecha) {
		this.fecha = fecha;
	}

	public java.lang.String getEtapa() {
		return this.etapa;
	}

	public void setEtapa(java.lang.String etapa) {
		this.etapa = etapa;
	}

	public java.util.List<java.lang.String> getDocumentosObservados() {
		return this.documentosObservados;
	}

	public void setDocumentosObservados(
			java.util.List<java.lang.String> documentosObservados) {
		this.documentosObservados = documentosObservados;
	}

	public java.lang.String getTipificacion() {
		return this.tipificacion;
	}

	public void setTipificacion(java.lang.String tipificacion) {
		this.tipificacion = tipificacion;
	}

	public java.util.List<java.lang.String> getSubTipificacion() {
		return this.subTipificacion;
	}

	public void setSubTipificacion(
			java.util.List<java.lang.String> subTipificacion) {
		this.subTipificacion = subTipificacion;
	}

	public java.lang.String getTipo() {
		return this.tipo;
	}

	public void setTipo(java.lang.String tipo) {
		this.tipo = tipo;
	}

	public java.lang.String getObservacionesInternas() {
		return this.observacionesInternas;
	}

	public void setObservacionesInternas(java.lang.String observacionesInternas) {
		this.observacionesInternas = observacionesInternas;
	}

	public java.lang.String getObservacionesExternas() {
		return this.observacionesExternas;
	}

	public void setObservacionesExternas(java.lang.String observacionesExternas) {
		this.observacionesExternas = observacionesExternas;
	}

	public java.lang.String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(java.lang.String usuario) {
		this.usuario = usuario;
	}

	public Tracking(java.lang.String fecha, java.lang.String etapa,
			java.util.List<java.lang.String> documentosObservados,
			java.lang.String tipificacion,
			java.util.List<java.lang.String> subTipificacion,
			java.lang.String tipo, java.lang.String observacionesInternas,
			java.lang.String observacionesExternas, java.lang.String usuario) {
		this.fecha = fecha;
		this.etapa = etapa;
		this.documentosObservados = documentosObservados;
		this.tipificacion = tipificacion;
		this.subTipificacion = subTipificacion;
		this.tipo = tipo;
		this.observacionesInternas = observacionesInternas;
		this.observacionesExternas = observacionesExternas;
		this.usuario = usuario;
	}

}
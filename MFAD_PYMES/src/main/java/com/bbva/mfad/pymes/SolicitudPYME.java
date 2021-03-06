package com.bbva.mfad.pymes;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SolicitudPYME implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String folioFabrica;
	private java.lang.String folioScorePYME;
	private java.lang.String programaEspecial;
	private java.lang.String puntaje;
	private java.util.List<com.bbva.mfad.pymes.Productos> productos;
	private com.bbva.mfad.pymes.VentasAnuales ventasAnuales;
	private com.bbva.mfad.pymes.Riesgos riesgos;
	private java.util.List<com.bbva.mfad.pymes.Tracking> tracking;

	public SolicitudPYME() {
	}

	public java.lang.String getFolioFabrica() {
		return this.folioFabrica;
	}

	public void setFolioFabrica(java.lang.String folioFabrica) {
		this.folioFabrica = folioFabrica;
	}

	public java.lang.String getFolioScorePYME() {
		return this.folioScorePYME;
	}

	public void setFolioScorePYME(java.lang.String folioScorePYME) {
		this.folioScorePYME = folioScorePYME;
	}

	public java.lang.String getProgramaEspecial() {
		return this.programaEspecial;
	}

	public void setProgramaEspecial(java.lang.String programaEspecial) {
		this.programaEspecial = programaEspecial;
	}

	public java.lang.String getPuntaje() {
		return this.puntaje;
	}

	public void setPuntaje(java.lang.String puntaje) {
		this.puntaje = puntaje;
	}

	public java.util.List<com.bbva.mfad.pymes.Productos> getProductos() {
		return this.productos;
	}

	public void setProductos(
			java.util.List<com.bbva.mfad.pymes.Productos> productos) {
		this.productos = productos;
	}

	public com.bbva.mfad.pymes.VentasAnuales getVentasAnuales() {
		return this.ventasAnuales;
	}

	public void setVentasAnuales(com.bbva.mfad.pymes.VentasAnuales ventasAnuales) {
		this.ventasAnuales = ventasAnuales;
	}

	public com.bbva.mfad.pymes.Riesgos getRiesgos() {
		return this.riesgos;
	}

	public void setRiesgos(com.bbva.mfad.pymes.Riesgos riesgos) {
		this.riesgos = riesgos;
	}

	public java.util.List<com.bbva.mfad.pymes.Tracking> getTracking() {
		return this.tracking;
	}

	public void setTracking(
			java.util.List<com.bbva.mfad.pymes.Tracking> tracking) {
		this.tracking = tracking;
	}

	public SolicitudPYME(java.lang.String folioFabrica,
			java.lang.String folioScorePYME, java.lang.String programaEspecial,
			java.lang.String puntaje,
			java.util.List<com.bbva.mfad.pymes.Productos> productos,
			com.bbva.mfad.pymes.VentasAnuales ventasAnuales,
			com.bbva.mfad.pymes.Riesgos riesgos,
			java.util.List<com.bbva.mfad.pymes.Tracking> tracking) {
		this.folioFabrica = folioFabrica;
		this.folioScorePYME = folioScorePYME;
		this.programaEspecial = programaEspecial;
		this.puntaje = puntaje;
		this.productos = productos;
		this.ventasAnuales = ventasAnuales;
		this.riesgos = riesgos;
		this.tracking = tracking;
	}

}
package com.bbva.mfad.pymes;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class VentasAnuales implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String ventasAnuales;
	private java.lang.String segmentacionCliente;
	private java.util.List<com.bbva.mfad.pymes.Depositos> depositos;

	public VentasAnuales() {
	}

	public java.lang.String getVentasAnuales() {
		return this.ventasAnuales;
	}

	public void setVentasAnuales(java.lang.String ventasAnuales) {
		this.ventasAnuales = ventasAnuales;
	}

	public java.lang.String getSegmentacionCliente() {
		return this.segmentacionCliente;
	}

	public void setSegmentacionCliente(java.lang.String segmentacionCliente) {
		this.segmentacionCliente = segmentacionCliente;
	}

	public java.util.List<com.bbva.mfad.pymes.Depositos> getDepositos() {
		return this.depositos;
	}

	public void setDepositos(
			java.util.List<com.bbva.mfad.pymes.Depositos> depositos) {
		this.depositos = depositos;
	}

	public VentasAnuales(java.lang.String ventasAnuales,
			java.lang.String segmentacionCliente,
			java.util.List<com.bbva.mfad.pymes.Depositos> depositos) {
		this.ventasAnuales = ventasAnuales;
		this.segmentacionCliente = segmentacionCliente;
		this.depositos = depositos;
	}

}
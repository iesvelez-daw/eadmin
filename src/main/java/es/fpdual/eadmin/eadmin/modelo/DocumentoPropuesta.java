package es.fpdual.eadmin.eadmin.modelo;

import java.util.Date;

public class DocumentoPropuesta extends Documento{
	
	private Integer codigoPropuesta;
	private Integer ejercicio;
	private String grupoPolitico;
	
	public DocumentoPropuesta(Integer codigo, String nombre, Date fechaCreacion, Boolean publico,
			EstadoDocumento estado,Integer codigoPropuesta, Integer ejercicio, String grupoPolitico,Date fechaUltimaModificacion) {
		super(codigo, nombre, fechaCreacion, publico, estado,fechaUltimaModificacion);
		this.codigoPropuesta = codigoPropuesta;
		this.ejercicio = ejercicio;
		this.grupoPolitico = grupoPolitico;
	}

	public Integer getCodigoPropuesta() {
		return codigoPropuesta;
	}

	public Integer getEjercicio() {
		return ejercicio;
	}

	public String getGrupoPolitico() {
		return grupoPolitico;
	}

	@Override
	public String toString() {
		return "DocumentoPropuesta [codigoPropuesta=" + codigoPropuesta + ", ejercicio=" + ejercicio
				+ ", grupoPolitico=" + grupoPolitico + "]";
	}
	
	

}

package btgpactual.pqr.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class RespuestaAdministrativaDTO {

	@Id
	private String _id;
	
	private String descripcion;
	private LocalDate fecha;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
}

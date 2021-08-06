package btgpactual.pqr.models;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "solicitudes")
public class SolicitudDTO {
	
	@Id
	private String _id;
	
	private Long radicado;
	private String titulo;
	private String descripcion;
	private LocalDate fecha;
	
	private String tipoID;
	@DBRef
	private TipoDTO tipo;
	
	private String clienteID;
	@DBRef
	private ClienteDTO cliente;
	
	private String solicitudOrigenID;
	@DBRef
	private SolicitudDTO solicitudOrigen;
	
	
	private List<RespuestaAdministrativaDTO> respuestaAdministrativa;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Long getRadicado() {
		return radicado;
	}

	public void setRadicado(Long radicado) {
		this.radicado = radicado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

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

	public String getTipoID() {
		return tipoID;
	}

	public void setTipoID(String tipoID) {
		this.tipoID = tipoID;
	}

	public TipoDTO getTipo() {
		return tipo;
	}

	public void setTipo(TipoDTO tipo) {
		this.tipo = tipo;
	}

	public String getClienteID() {
		return clienteID;
	}

	public void setClienteID(String clienteID) {
		this.clienteID = clienteID;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public String getSolicitudOrigenID() {
		return solicitudOrigenID;
	}

	public void setSolicitudOrigenID(String solicitudOrigenID) {
		this.solicitudOrigenID = solicitudOrigenID;
	}

	public SolicitudDTO getSolicitudOrigen() {
		return solicitudOrigen;
	}

	public void setSolicitudOrigen(SolicitudDTO solicitudOrigen) {
		this.solicitudOrigen = solicitudOrigen;
	}

	public List<RespuestaAdministrativaDTO> getRespuestaAdministrativa() {
		return respuestaAdministrativa;
	}

	public void setRespuestaAdministrativa(List<RespuestaAdministrativaDTO> respuestaAdministrativa) {
		this.respuestaAdministrativa = respuestaAdministrativa;
	}
	
	
}

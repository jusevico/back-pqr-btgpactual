package btgpactual.pqr.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tipos")
public class TipoDTO {
	
	@Id
	private String _id;
	
	private String nombre;
	private boolean inicial;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isInicial() {
		return inicial;
	}
	public void setInicial(boolean inicial) {
		this.inicial = inicial;
	}
	
	
	
}

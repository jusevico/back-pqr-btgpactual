package btgpactual.pqr.services;

import org.springframework.beans.factory.annotation.Autowired;

import btgpactual.pqr.models.SolicitudDTO;
import btgpactual.pqr.repositories.ISolicitudDAO;

public class SolicitudService {
	
	@Autowired
	private ISolicitudDAO repository;
	
	public SolicitudService(ISolicitudDAO repository) {
		this.repository = repository;
	}

	
	public SolicitudDTO getMaxRadicado() {
		return this.repository.findFirstByOrderByRadicadoDesc();
	}

}

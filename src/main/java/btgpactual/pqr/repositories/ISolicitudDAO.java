package btgpactual.pqr.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import btgpactual.pqr.models.SolicitudDTO;

public interface ISolicitudDAO extends MongoRepository<SolicitudDTO, String> {

	List<SolicitudDTO> findByClienteID(String clienteID);
	
	public SolicitudDTO findFirstByOrderByRadicadoDesc();
	
}

package btgpactual.pqr.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import btgpactual.pqr.models.TipoDTO;

public interface ITipoDAO extends MongoRepository<TipoDTO, String> {

}

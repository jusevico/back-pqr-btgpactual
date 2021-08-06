package btgpactual.pqr.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import btgpactual.pqr.models.ClienteDTO;

public interface IClienteDAO extends MongoRepository<ClienteDTO, String> {

}

package btgpactual.pqr.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import btgpactual.pqr.models.ClienteDTO;
import btgpactual.pqr.repositories.IClienteDAO;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private IClienteDAO repository;
	
	@GetMapping("/{id}")
	public Optional<ClienteDTO> findByClienteID (@PathVariable String id) {
		return repository.findById(id);
	}
}

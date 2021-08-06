package btgpactual.pqr.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import btgpactual.pqr.models.TipoDTO;
import btgpactual.pqr.repositories.ITipoDAO;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/tipos")
public class TipoController {

	@Autowired
	private ITipoDAO repository;
	
	@GetMapping("/")
	public List<TipoDTO> getAll () {
		return repository.findAll();
	}
	
}

package btgpactual.pqr.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import btgpactual.pqr.models.SolicitudDTO;
import btgpactual.pqr.repositories.ISolicitudDAO;
import btgpactual.pqr.response.ResponseHandler;
import btgpactual.pqr.services.SolicitudService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/solicitudes")
public class SolicitudController {

	@Autowired
	private ISolicitudDAO repository;
	
	@GetMapping("/get-by-cliente-id/{clienteID}")
	public List<SolicitudDTO> findByClienteID (@PathVariable String clienteID) {
		return repository.findByClienteID(clienteID);
	}
	
	@GetMapping("/{id}")
	public Optional<SolicitudDTO> findByID (@PathVariable String id) {
		return repository.findById(id);
	}
	
	@PostMapping("/nuevo")
	public ResponseEntity<Object> create(@Validated @RequestBody SolicitudDTO solicitud) {
		try {
			SolicitudService solicitudService = new SolicitudService(repository);
			SolicitudDTO ultimaSolicitud = solicitudService.getMaxRadicado();
			solicitud.setRadicado(ultimaSolicitud.getRadicado() + 1);
			repository.insert(solicitud);
            return  ResponseHandler.generateResponse("Solicitud creada con éxito.", HttpStatus.OK);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS);
        }
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable String id, @Validated @RequestBody SolicitudDTO solicitud) {
		try {
			repository.save(solicitud);
            return ResponseHandler.generateResponse("Solicitud actualizada con éxito.", HttpStatus.OK);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS);
        }
	}
	
}

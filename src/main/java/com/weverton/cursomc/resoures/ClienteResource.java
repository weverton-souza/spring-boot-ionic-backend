package com.weverton.cursomc.resoures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weverton.cursomc.domains.Cliente;
import com.weverton.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired// Anotação usada para intanciar automaticamente a depedência, através do mecânismo
	          // de injeção de depedência ou inversão de controle.
	ClienteService clienteServ;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable final Integer id) {
		//ResponseEntity: Tipo especial do Spring que encapsula várias informações de uma resposta Http para um serviço Rest.
		
		Cliente cat = clienteServ.buscar(id);
		
		return ResponseEntity.ok().body(cat);
	}
	
}

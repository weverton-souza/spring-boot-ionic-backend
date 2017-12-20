package com.weverton.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weverton.cursomc.domains.Cliente;
import com.weverton.cursomc.repositories.ClienteRepository;
import com.weverton.cursomc.services.exception.ObjectNotFoundException;


/**
 * @author weverton
 *
 *
 */

@Service
public class ClienteService {
	
	@Autowired// Anotação: Usada para intanciar automaticamente a depedência, através do mecânismo de injeção de depedência ou inversão
			// de controle.
	ClienteRepository clienteRep;
	
	public Cliente buscar(final Integer id) {
		
		Cliente obj = clienteRep.findOne(id);
		
		if(obj == null) {
			
			throw new ObjectNotFoundException("Objeto não encontrado. ID: " + id +
					", Tipo: " + Cliente.class.getName());
		}
		return obj;
	}
}

package com.weverton.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weverton.cursomc.domains.Pedido;
import com.weverton.cursomc.repositories.PedidoRepository;
import com.weverton.cursomc.services.exception.ObjectNotFoundException;


/**
 * @author weverton
 *
 *
 */

@Service
public class PedidoService {
	
	@Autowired// Anotação: Usada para intanciar automaticamente a depedência, através do mecânismo de injeção de depedência ou inversão
			// de controle.
	PedidoRepository pedidoRep;
	
	public Pedido buscar(final Integer id) {
		
		Pedido obj = pedidoRep.findOne(id);
		
		if(obj == null) {
			
			throw new ObjectNotFoundException("Objeto não encontrado. ID: " + id +
					", Tipo: " + Pedido.class.getName());
		}
		return obj;
	}
}

package com.silviofranco.cursospring.services;

import com.silviofranco.cursospring.domain.Pedido;
import com.silviofranco.cursospring.repositories.PedidoRepository;
import com.silviofranco.cursospring.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo " + Pedido.class.getName()));
	}

}

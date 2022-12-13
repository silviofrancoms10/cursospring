package com.silviofranco.cursospring.services;

import com.silviofranco.cursospring.domain.Cliente;
import com.silviofranco.cursospring.repositories.ClienteRepository;
import com.silviofranco.cursospring.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo " + Cliente.class.getName()));
	}

}

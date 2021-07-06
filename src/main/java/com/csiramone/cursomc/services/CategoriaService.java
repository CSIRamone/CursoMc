package com.csiramone.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csiramone.cursomc.domain.Categoria;
import com.csiramone.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository catrepo;
	
	public Optional<Categoria> buscar(Integer id) {
		Optional<Categoria> obj = catrepo.findById(id);
		return obj;
	}

}

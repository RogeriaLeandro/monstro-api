package br.edu.infnet.service;

import java.util.List;

import br.edu.infnet.model.Monstro;

public interface MonstroService {
	void create(Monstro entity);
	void delete(Monstro entity);
	Monstro findById(Long id);
	List<Monstro> getAll();
    Monstro getRandom();
}

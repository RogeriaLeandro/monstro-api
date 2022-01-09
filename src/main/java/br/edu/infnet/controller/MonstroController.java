package br.edu.infnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.model.Monstro;
import br.edu.infnet.service.MonstroService;

@RestController
@RequestMapping("/api/monstro")
public class MonstroController {

	@Autowired
	MonstroService monstroService;

	@GetMapping
	public List<Monstro> getAll() {
		return monstroService.getAll();
	}
	
	@GetMapping("/random")
	public Monstro getRandom() {
		return monstroService.getRandom();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Monstro byId = this.monstroService.findById(id);
		this.monstroService.delete(byId);
	}
	
	@PostMapping
	public void create(@RequestBody Monstro m) {
		this.monstroService.create(m);
	}
}

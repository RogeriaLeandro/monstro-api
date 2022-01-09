package br.edu.infnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PostMapping
	public void create(@RequestBody Monstro m) {
		this.monstroService.create(m);
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Monstro byId = this.monstroService.getById(id);
		this.monstroService.delete(byId);
	}
	
	@GetMapping("/{id}")
	public Monstro getById(@PathVariable Long id) {
		return this.monstroService.getById(id);
	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable Long id, @RequestBody Monstro m){
		this.monstroService.update(id, m);
	}
	
	@GetMapping
	public List<Monstro> getAll() {
		return monstroService.getAll();
	}
	
	@GetMapping("/random")
	public Monstro getRandom() {
		return monstroService.getRandom();
	}
	

	
}

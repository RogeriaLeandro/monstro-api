package br.edu.infnet.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	@Value("${microservice.example.greeting}")
	private String hello;

	@Autowired
	MonstroService monstroService;
	
	@GetMapping("/testeServerConfig")
	public ResponseEntity<String> testeServerConfig(){
		return ResponseEntity.ok(hello);
	}
	
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
	public ResponseEntity<Monstro> getById(@PathVariable Long id) {
		Monstro m = null;
		
		try {
			m = this.monstroService.getById(id);
			return new ResponseEntity<Monstro>(m,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
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

package br.edu.infnet.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.Monstro;
import br.edu.infnet.service.MonstroService;

@Component
public class InsertData {
	
	@Autowired
	MonstroService monstroService;
	
	@EventListener
	public void appReady(ApplicationReadyEvent event) {
		
		Monstro monstro = new Monstro();
		monstro.setNome("Morto-Vivo");
		monstro.setPdv(25);
		monstro.setForca(4);
		monstro.setDefesa(0);
		monstro.setAgilidade(1);
		monstro.setFdd("2d4");
		this.monstroService.create(monstro);
		
		monstro = new Monstro();
		monstro.setNome("Orc");
		monstro.setPdv(20);
		monstro.setForca(6);
		monstro.setDefesa(2);
		monstro.setAgilidade(2);
		monstro.setFdd("1d8");
		this.monstroService.create(monstro);
		
		monstro = new Monstro();
		monstro.setNome("ChuckNorris");
		monstro.setPdv(99999999);
		monstro.setForca(9999999);
		monstro.setDefesa(9999999);
		monstro.setAgilidade(99999999);
		monstro.setFdd("999999d999999");
		this.monstroService.create(monstro);
		
		monstro = new Monstro();
		monstro.setNome("Rato");
		monstro.setPdv(5);
		monstro.setForca(1);
		monstro.setDefesa(0);
		monstro.setAgilidade(3);
		monstro.setFdd("1d4");
		this.monstroService.create(monstro);
		
		monstro = new Monstro();
		monstro.setNome("Barata");
		monstro.setPdv(2);
		monstro.setForca(1);
		monstro.setDefesa(0);
		monstro.setAgilidade(2);
		monstro.setFdd("1d2");
		this.monstroService.create(monstro);
		
		monstro = new Monstro();
		monstro.setNome("Dragão");
		monstro.setPdv(50);
		monstro.setForca(6);
		monstro.setDefesa(4);
		monstro.setAgilidade(1);
		monstro.setFdd("3d8");
		this.monstroService.create(monstro);

	}
	
}

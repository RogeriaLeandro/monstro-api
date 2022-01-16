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
		
		try {
			if (!monstroService.getAll().isEmpty()) {
				return;
			}
		}catch(Exception e){
			
		}
		
		Monstro monstro = new Monstro();
		monstro.setNome("Morto-Vivo");
		monstro.setPontosDeVida(25);
		monstro.setForca(4);
		monstro.setDefesa(0);
		monstro.setAgilidade(1);
		monstro.setQtdDadosDano(2);
		monstro.setTamanhoDadosDano(4);
		this.monstroService.create(monstro);
		
		monstro = new Monstro();
		monstro.setNome("Orc");
		monstro.setPontosDeVida(20);
		monstro.setForca(6);
		monstro.setDefesa(2);
		monstro.setAgilidade(2);
		monstro.setQtdDadosDano(1);
		monstro.setTamanhoDadosDano(9);
		this.monstroService.create(monstro);
		
		monstro = new Monstro();
		monstro.setNome("ChuckNorris");
		monstro.setPontosDeVida(99999999);
		monstro.setForca(9999999);
		monstro.setDefesa(9999999);
		monstro.setAgilidade(99999999);
		monstro.setQtdDadosDano(999);
		monstro.setTamanhoDadosDano(999);
		this.monstroService.create(monstro);
		
		monstro = new Monstro();
		monstro.setNome("Rato");
		monstro.setPontosDeVida(5);
		monstro.setForca(1);
		monstro.setDefesa(0);
		monstro.setAgilidade(3);
		monstro.setQtdDadosDano(1);
		monstro.setTamanhoDadosDano(4);
		this.monstroService.create(monstro);
		
		monstro = new Monstro();
		monstro.setNome("Barata");
		monstro.setPontosDeVida(2);
		monstro.setForca(1);
		monstro.setDefesa(0);
		monstro.setAgilidade(2);
		monstro.setQtdDadosDano(1);
		monstro.setTamanhoDadosDano(2);
		this.monstroService.create(monstro);
		
		monstro = new Monstro();
		monstro.setNome("Dragão");
		monstro.setPontosDeVida(50);
		monstro.setForca(6);
		monstro.setDefesa(4);
		monstro.setAgilidade(1);
		monstro.setQtdDadosDano(3);
		monstro.setTamanhoDadosDano(8);
		this.monstroService.create(monstro);

	}
	
}

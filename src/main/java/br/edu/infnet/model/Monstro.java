package br.edu.infnet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Monstro {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private int pontosDeVida;
	private int forca;
	private int defesa;
	private int agilidade;
	private int qtdDadosDano;
	private int tamanhoDadosDano;

}

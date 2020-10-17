package com.accenture.challenge.accentureChallenge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mensagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nome ;
	
	private String numero;
	
	
	
	
	
	
	
	
}

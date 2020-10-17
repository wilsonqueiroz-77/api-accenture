package com.accenture.challenge.accentureChallenge.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MensagemController	 {
	
	public ArrayList<String> nome = null;
	
	
	@PostMapping(path ="/mensagem" ,consumes = "application/json", produces = {"application/json"} )
	@ResponseStatus(code = HttpStatus.CREATED)
	public String create(String numero) {
				   
			switch (numero) {

			case "2":
				numero = "a";
				nome.add(numero);
				break;
			case "22":
				numero = "b";
				nome.add(numero);
				break;
			case "222":
				numero = "c";
				nome.add(numero);
				break;
			case "3":
				numero = "d";
				nome.add(numero);
				break;
			case "33":
				numero = "e";
				nome.add(numero);
				break;
			case "333":
				numero = "f";
				nome.add(numero);
				break;
			case "4":
				numero = "g";
				nome.add(numero);
				break;
			case "44":
				numero = "h";
				nome.add(numero);
				break;
			case "444":
				numero = "i";
				nome.add(numero);
				break;
			case "5":
				numero = "j";
				nome.add(numero);
				break;
			case "55":
				numero = "k";
				nome.add(numero);
				break;
			case "555":
				numero = "l";
				nome.add(numero);
				break;
			case "6":
				numero = "m";
				nome.add(numero);
				break;
			case "66":
				numero = "n";
				nome.add(numero);
				break;
			case "666":
				numero = "o";
				nome.add(numero);
				break;
			case "7":
				numero = "p";
				nome.add(numero);
				break;
			case "77":
				numero = "q";
				nome.add(numero);
				break;
			case "777":
				numero = "r";
				nome.add(numero);
				break;
			case "7777":
				numero = "s";
				nome.add(numero);
				break;
			case "8":
				numero = "t";
				nome.add(numero);
				break;
			case "88":
				numero = "u";
				nome.add(numero);
				break;
			case "888":
				numero = "v";
				nome.add(numero);
				break;
			case "9":
				numero = "x";
				nome.add(numero);
				break;
			case "99":
				numero = "w";
				nome.add(numero);
				break;
			case "999":
				numero = "y";
				nome.add(numero);
				break;
			case "9999":
				numero = "z";
				nome.add(numero);
				break;
			}
			
			String texto ="";
			for (String aux : nome) {
				
				 texto+=aux;
			}			
		return texto;
	}
	


}

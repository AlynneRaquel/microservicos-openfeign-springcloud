package com.example.openfeignclient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
	
	private Long id;
	private String nome;
	private String SKU;
	private String estoque;
	
	Produto(){
		
	}

}

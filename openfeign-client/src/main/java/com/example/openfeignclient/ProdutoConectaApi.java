package com.example.openfeignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "produtos", url= "http://localhost:8080/")
public interface ProdutoConectaApi {

	@RequestMapping(method = RequestMethod.GET, value = "/produtos")
	List<Produto> buscarProduto();
	
	@RequestMapping(method = RequestMethod.GET, value = "/produtos/{id}", produces = "application/json")
	Produto buscarProdutoPorId(@PathVariable("id") Long id);

}

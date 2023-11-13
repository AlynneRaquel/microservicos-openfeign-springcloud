package com.example.openfeignclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	ProdutoConectaApi conectaApi;

	@GetMapping
	public List<Produto> ListarProduto() {
		return conectaApi.buscarProduto();
	}
	
	@GetMapping("/{id}")
	public Produto buscarProduto(@PathVariable Long id) {
		return conectaApi.buscarProdutoPorId(id);	
	}

}
//
//@GetMapping("/{id}")
//public ResponseEntity<Produto> buscar(@PathVariable Long id) {
//	return produtoRepository.findById(id)
//			.map(ResponseEntity::ok)
//			.orElse(ResponseEntity.notFound().build());	
//}
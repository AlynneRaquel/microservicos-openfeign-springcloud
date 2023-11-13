package com.example.openfeignserver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping
	public List<Produto> listar(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> buscar(@PathVariable Long id) {
		return produtoRepository.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());	
	}
}

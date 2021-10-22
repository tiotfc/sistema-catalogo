package br.com.sada.sistema.catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.sistema.catalogo.model.Produto;
import br.com.sada.sistema.catalogo.model.dto.ProdutoEntradaDto;
import br.com.sada.sistema.catalogo.service.ProdutoServiceImpl;

@RestController
@RequestMapping("/produto/")
public class ProdutoController{

	private ProdutoServiceImpl produtoService;

	@Autowired
	public ProdutoController(ProdutoServiceImpl produtoService) {
		super();
		this.produtoService = produtoService;
	}

	@PostMapping
	public Produto salvar(@RequestBody ProdutoEntradaDto produtoEntrada) {
		return produtoService.insertProduto(produtoEntrada);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Integer id) {
		produtoService.deleteProduto(id);
	}
	
	@GetMapping
	public List<Produto> listarTodos() {
		return produtoService.getProduto();
	}
	
	@GetMapping("/{id}")
	public Produto buscarPorId(@PathVariable Integer id) {
		return produtoService.getProdutoPorId(id);
	}
	
	
}

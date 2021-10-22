package br.com.sada.sistema.catalogo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sada.sistema.catalogo.model.Categoria;
import br.com.sada.sistema.catalogo.model.Produto;
import br.com.sada.sistema.catalogo.model.dto.ProdutoEntradaDto;
import br.com.sada.sistema.catalogo.repository.CategoriaRepository;
import br.com.sada.sistema.catalogo.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl {

	private ProdutoRepository produtoRepository;
	private CategoriaRepository categoriaRepository;

	public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
		super();
		this.produtoRepository = produtoRepository;
	}
	
	
	public List<Produto> getProduto() {
		return produtoRepository.findAll();
	}

	public Produto getProdutoPorId(Integer id) {
		return produtoRepository.findById(id).get();
	}

	public void deleteProduto(Integer id) {
		produtoRepository.deleteById(id);
	}
	
	public Produto insertProduto(ProdutoEntradaDto produtoEntrada) {
		Categoria categoria = categoriaRepository.save(new Categoria(produtoEntrada.getCategoriaNome()));
		return produtoRepository.save(new Produto(produtoEntrada.getProdutoNome(), produtoEntrada.getPreco(), categoria));

	}
	
}

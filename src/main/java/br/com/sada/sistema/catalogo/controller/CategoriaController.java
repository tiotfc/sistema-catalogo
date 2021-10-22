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

import br.com.sada.sistema.catalogo.model.Categoria;
import br.com.sada.sistema.catalogo.service.CategoriaService;


@RestController
@RequestMapping("/categoria/")
public class CategoriaController {
	
	private  CategoriaService categoriaService;
	
	@Autowired
	public CategoriaController(CategoriaService categoriaService) {
		super();
		this.categoriaService = categoriaService;
	}

	@PostMapping
	public Categoria salvar(@RequestBody Categoria categoria) {
		return categoriaService.insertProduto(categoria);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Integer id) {
		categoriaService.deleteCategoria(id);
	}
	
	@GetMapping
	public List<Categoria> listarTodos() {
		return categoriaService.getCategoria();
	}
	
	@GetMapping("/{id}")
	public Categoria buscarPorId(@PathVariable Integer id) {
		return categoriaService.getCategoriaPorId(id);
	}

}

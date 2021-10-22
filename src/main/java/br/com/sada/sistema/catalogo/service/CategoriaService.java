package br.com.sada.sistema.catalogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sada.sistema.catalogo.model.Categoria;
import br.com.sada.sistema.catalogo.repository.CategoriaRepository;

@Service
public class CategoriaService {

	private CategoriaRepository categoriaRepo;
	
	@Autowired
	public CategoriaService(CategoriaRepository categoriaRepo) {
		super();
		this.categoriaRepo = categoriaRepo;
	}


	public List<Categoria> getCategoria() {
		return categoriaRepo.findAll();
	}

	public Categoria getCategoriaPorId(Integer id) {
		return categoriaRepo.findById(id).get();
	}

	public void deleteCategoria(Integer id) {
		categoriaRepo.deleteById(id);
	}
	
	public Categoria insertProduto(Categoria categoria) {
		return categoriaRepo.save(new Categoria(categoria.getNome()));

	}
	
	
}

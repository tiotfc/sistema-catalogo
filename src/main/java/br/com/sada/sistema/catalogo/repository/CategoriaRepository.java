package br.com.sada.sistema.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sada.sistema.catalogo.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}

package br.com.sada.sistema.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sada.sistema.catalogo.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}

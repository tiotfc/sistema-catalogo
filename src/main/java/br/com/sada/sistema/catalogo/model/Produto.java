package br.com.sada.sistema.catalogo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private double preco;
	
	@ManyToOne
	@JoinColumn(name = "categoria")
	private Categoria categoria;
	
	public Produto(String nome, double preco, Categoria categoria) {
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	public Produto() {
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	
	

}

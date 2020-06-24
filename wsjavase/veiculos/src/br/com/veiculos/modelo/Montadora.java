package br.com.veiculos.modelo;

public class Montadora {
	
	public Montadora() {
		super();
	}
	public Montadora(String nome, String simbolo, String nacionalidade) {
		super();
		this.nome = nome;
		this.simbolo = simbolo;
		this.nacionalidade = nacionalidade;
	}
	private String nome;
	private String simbolo;
	private String nacionalidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	
}

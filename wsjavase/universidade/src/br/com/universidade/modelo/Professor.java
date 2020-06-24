package br.com.universidade.modelo;

public class Professor {
	private int id;
	private String contratacao;
	private String nome;
	private String apelido;
	
	public void preencherId(int id) {
		this.id = id;
	}
	public void preencherContratacao(String contratacao) {
		this.contratacao = contratacao;
	}
	public void preencherNome(String nome) {
		this.nome = nome;
	}
	public void preencherApelido(String apelido) {
		this.apelido = apelido;
	}
	public void preencherTudo(int id, String contratacao, String nome, String apelido) {
		this.id = id;
		this.contratacao = contratacao;
		this.nome = nome;
		this.apelido = apelido;
	}
	public int exibirId() {
		return this.id;
	}
	public String exibirContratacao() {
		return this.contratacao;
	}
	public String exibirNome() {
		return this.nome;
	}
	public String exibirApelido() {
		return this.apelido;
	}
	public String exibirTudo() {
		return id+"\n"+contratacao+"\n"+nome+"\n"+apelido;
	}
}

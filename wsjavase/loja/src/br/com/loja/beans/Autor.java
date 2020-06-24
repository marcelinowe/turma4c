package br.com.loja.beans;

public class Autor {
	
	public Autor() {
		super();
	}
	public Autor(String nomeAcademico, String email, String nome) {
		super();
		this.nomeAcademico = nomeAcademico;
		this.email = email;
		this.nome = nome;
	}
	private String nomeAcademico;
	private String email;
	private String nome;
	public String getNomeAcademico() {
		return nomeAcademico;
	}
	public void setNomeAcademico(String nomeAcademico) {
		this.nomeAcademico = nomeAcademico;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}

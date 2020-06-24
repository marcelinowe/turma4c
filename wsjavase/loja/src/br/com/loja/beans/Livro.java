package br.com.loja.beans;

public class Livro extends Produto {
	private Autor autor;
	private String editora;
	private String isbn;
	
	public Livro() {
		super();
	}
	public Livro(int pId, String pDescricao, float pValorVenda, float pValorCompra, Autor autor, String editora,
			String isbn) {
		super(pId, pDescricao, pValorVenda, pValorCompra);
		this.autor = autor;
		this.editora = editora;
		this.isbn = isbn;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}

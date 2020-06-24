package br.com.loja.beans;

import br.com.lojas.interfaces.Padrao;

public class CD extends Produto implements Padrao{
	private String artista;
	private String gravadora;

	public void definirValorVenda() {
		super.setValorVenda(super.getValorCompra() * 1.1f);
	}
	
	public String getAll() {
		return super.getAll() + "\n" + artista + "\n" + gravadora;
	}
	
	public CD() {
		super();
	}

	public CD(int pId, String pDescricao, float pValorVenda, float pValorCompra, String artista, String gravadora) {
		super(pId, pDescricao, pValorVenda, pValorCompra);
		this.artista = artista;
		this.gravadora = gravadora;
	}
	
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	
	
}

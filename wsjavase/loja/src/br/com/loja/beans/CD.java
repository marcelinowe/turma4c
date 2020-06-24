package br.com.loja.beans;

public class CD extends Produto{
	private String artista;
	private String gravadora;
	
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

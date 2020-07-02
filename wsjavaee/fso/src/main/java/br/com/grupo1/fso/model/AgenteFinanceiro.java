package br.com.grupo1.fso.model;


public class AgenteFinanceiro {
	private int id;
	private String nomeAgente;
	private float volumeTransacional;
	
	public AgenteFinanceiro(int id, String nomeAgente, float volumeTransacional) {
		super();
		this.id = id;
		this.nomeAgente = nomeAgente;
		this.volumeTransacional = volumeTransacional;
	}
	public AgenteFinanceiro() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeAgente() {
		return nomeAgente;
	}
	public void setNomeAgente(String nomeAgente) {
		this.nomeAgente = nomeAgente;
	}
	public float getVolumeTransacional() {
		return volumeTransacional;
	}
	public void setVolumeTransacional(float volumeTransacional) {
		this.volumeTransacional = volumeTransacional;
	}
	
	
}

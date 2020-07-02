package br.com.grupo1.fso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mtb310_ag_financeiro")
public class AgenteFinanceiro {
	@Column(name="id_agente")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nome_agente",length=100)
	private String nomeAgente;
	
	@Column(name="volume_transacional")
	private float volumeTransacional;
	
	public AgenteFinanceiro() {
		super();
	}

	public AgenteFinanceiro(int id, String nomeAgente, float volumeTransacional) {
		super();
		this.id = id;
		this.nomeAgente = nomeAgente;
		this.volumeTransacional = volumeTransacional;
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

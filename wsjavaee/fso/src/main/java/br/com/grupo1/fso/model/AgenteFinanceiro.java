package br.com.grupo1.fso.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	@Transient
	private int totalsucesso;
	@Transient
	private int totalfalha;
	@Transient
	private int totalfraude;
	
	@JsonIgnoreProperties("agenteFinanceiro")
	@OneToMany(cascade=CascadeType.ALL,mappedBy="agenteFinanceiro")
	private List<Transacao> transacoes;
	
	public AgenteFinanceiro() {
		super();
	}

	public AgenteFinanceiro(int id, String nomeAgente, float volumeTransacional, int totalsucesso, int totalfalha,
			int totalfraude, List<Transacao> transacoes) {
		super();
		this.id = id;
		this.nomeAgente = nomeAgente;
		this.volumeTransacional = volumeTransacional;
		this.totalsucesso = totalsucesso;
		this.totalfalha = totalfalha;
		this.totalfraude = totalfraude;
		this.transacoes = transacoes;
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

	public int getTotalsucesso() {
		return totalsucesso;
	}

	public void setTotalsucesso(int totalsucesso) {
		this.totalsucesso = totalsucesso;
	}

	public int getTotalfalha() {
		return totalfalha;
	}

	public void setTotalfalha(int totalfalha) {
		this.totalfalha = totalfalha;
	}

	public int getTotalfraude() {
		return totalfraude;
	}

	public void setTotalfraude(int totalfraude) {
		this.totalfraude = totalfraude;
	}
	
	public List<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
	}
}

package br.com.grupo1.fso.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="mtb310_transaction")
public class Transacao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_transacao")
	private int id;
	
	@Column(name="data_hora")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataTransacao;

	@Column(name="dispositivo")
	private int dispositivo;
	
	@Column(name="valor_solic")
	private float valorSolicitado;
	
	@Column(name="valor_aut")
	private float valorAutorizado;
	
	@Column(name="status")
	private int status;
	
	@JsonIgnoreProperties("transacoes")
	@ManyToOne
	private AgenteFinanceiro agenteFinanceiro;

	public Transacao() {
		super();
	}
	public Transacao(int id, Date dataTransacao, int dispositivo, float valorSolicitado, float valorAutorizado,
			int status, AgenteFinanceiro agenteFinanceiro) {
		super();
		this.id = id;
		this.dataTransacao = dataTransacao;
		this.dispositivo = dispositivo;
		this.valorSolicitado = valorSolicitado;
		this.valorAutorizado = valorAutorizado;
		this.status = status;
		this.agenteFinanceiro = agenteFinanceiro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataTransacao() {
		return dataTransacao;
	}
	public void setDataTransacao(Date dataTransacao) {
		this.dataTransacao = dataTransacao;
	}
	public int getDispositivo() {
		return dispositivo;
	}
	public void setDispositivo(int dispositivo) {
		this.dispositivo = dispositivo;
	}
	public float getValorSolicitado() {
		return valorSolicitado;
	}
	public void setValorSolicitado(float valorSolicitado) {
		this.valorSolicitado = valorSolicitado;
	}
	public float getValorAutorizado() {
		return valorAutorizado;
	}
	public void setValorAutorizado(float valorAutorizado) {
		this.valorAutorizado = valorAutorizado;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public AgenteFinanceiro getAgenteFinanceiro() {
		return agenteFinanceiro;
	}
	public void setAgenteFinanceiro(AgenteFinanceiro agenteFinanceiro) {
		this.agenteFinanceiro = agenteFinanceiro;
	}
	
}

package br.com.veiculos.modelo;

public class Automovel {
	public Automovel() {}
	
	public Automovel(String placa, float valorIpva, float valorSeguro, float velocidadeAtual, int capacidadeTanque,
			Montadora montadora) {
		super();
		this.placa = placa;
		this.valorIpva = valorIpva;
		this.valorSeguro = valorSeguro;
		this.velocidadeAtual = velocidadeAtual;
		this.capacidadeTanque = capacidadeTanque;
		this.montadora = montadora;
	}

	private String placa;
	private float valorIpva;
	private float valorSeguro;
	private float velocidadeAtual;
	private int capacidadeTanque;
	private Montadora montadora;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public float getValorIpva() {
		return valorIpva;
	}
	public void setValorIpva(float valorIpva) {
		this.valorIpva = valorIpva;
	}
	public float getValorSeguro() {
		return valorSeguro;
	}
	public void setValorSeguro(float valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public Montadora getMontadora() {
		return montadora;
	}

	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}

	public float getTotal() {
		return this.valorIpva + this.valorSeguro;
	}
	public void acelerar() {
		this.velocidadeAtual+=10;
	}
	public void acelerar(float valor) {
		this.velocidadeAtual+=valor;
	}
	public double getDistancia(float autonomia) {
		return capacidadeTanque * autonomia;
	}
	public boolean getStatus() {
		if (velocidadeAtual > 0) {
			return true;
		}
		return false;
	}
	public void desacelerar(float valor) {
		this.velocidadeAtual -= valor;
	}
}

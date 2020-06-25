package br.com.collection.beans;

public class Cargo implements Comparable<Cargo>{
	private String nome;
	private double salario;
	private String nivel;
	
	public Cargo() {
		super();
	}
	public Cargo(String nome, double salario, String nivel) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.nivel = nivel;
	}
	
	@Override
	public int compareTo(Cargo outro) {
		return this.getNome().compareTo(outro.getNome());
	}

	/*public int compareTo(Cargo outro) {
		// TODO Auto-generated method stub
		if(this.salario > outro.salario) {
			return 1;
		}
		else if(this.salario == outro.salario){
			return 0;
		}
		else {
			return -1;
		}
	}*/

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}

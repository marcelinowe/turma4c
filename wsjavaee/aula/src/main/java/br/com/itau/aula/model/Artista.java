package br.com.itau.aula.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TB_AULA_ARTISTA")
public class Artista {
	
	@Column(name="ID")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NOMEARTISTICO",length=100)
	private String nomeArtistico;
	
	@Column(name="NACIONALIDADE",length=30)
	private String nacionalidade;
	
	@JsonIgnoreProperties("artista")//nome do atributo que referencia artista na classe Musica
	@OneToMany(cascade=CascadeType.ALL,mappedBy="artista")
	private List<Musica> musicas;
	
	public Artista() {
		super();
	}
	

	public Artista(int id, String nomeArtistico, String nacionalidade, List<Musica> musicas) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
		this.musicas = musicas;
	}


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
}

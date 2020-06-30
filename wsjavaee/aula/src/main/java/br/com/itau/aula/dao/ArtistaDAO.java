package br.com.itau.aula.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.aula.model.Artista;

public interface ArtistaDAO extends CrudRepository<Artista,Integer>{
	public List<Artista> findByNacionalidade(String nacionalidade);
}

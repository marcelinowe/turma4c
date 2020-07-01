package br.com.itau.aula.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.aula.model.Musica;

public interface MusicaDAO extends CrudRepository<Musica,Integer>{

}

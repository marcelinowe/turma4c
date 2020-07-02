package br.com.grupo1.fso.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.grupo1.fso.model.Transacao;

public interface TransacaoDAO extends CrudRepository<Transacao,Integer>{

}

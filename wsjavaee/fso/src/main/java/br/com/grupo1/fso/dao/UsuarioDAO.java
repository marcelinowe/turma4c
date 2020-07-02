package br.com.grupo1.fso.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.grupo1.fso.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{
	public Usuario findByEmailAndSenha(String email, String senha);
	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods

}

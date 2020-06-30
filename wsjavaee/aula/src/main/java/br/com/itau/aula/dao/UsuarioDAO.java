package br.com.itau.aula.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.aula.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{
	public Usuario findByEmailAndSenha(String email, String senha);
	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods

}

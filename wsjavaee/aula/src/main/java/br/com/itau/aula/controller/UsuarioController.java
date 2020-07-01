package br.com.itau.aula.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.aula.dao.UsuarioDAO;
import br.com.itau.aula.model.Usuario;

@CrossOrigin("*")
@RestController
public class UsuarioController {
	@Autowired
	private UsuarioDAO dao;
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> exibirUsuarios(){
		ArrayList<Usuario> lista = (ArrayList<Usuario>) dao.findAll();
		
		if(lista.size() == 0) {
			return ResponseEntity.status(403).build();
		}
		else {
			return ResponseEntity.ok(lista);
		}
		
	}
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<Usuario> exibirUsuarioId(@PathVariable int id){
		Usuario resposta = dao.findById(id).orElse(null);
		
		if(resposta == null) {
			return ResponseEntity.status(404).build();
		}
		else
		{
			return ResponseEntity.ok(resposta);
		}
	}
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> login(@RequestBody Usuario usuario){
		Usuario resposta = dao.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
		
		if(resposta==null) {
			return ResponseEntity.status(403).build();
		}
		else {
			return ResponseEntity.ok(resposta);
		}
	}
}

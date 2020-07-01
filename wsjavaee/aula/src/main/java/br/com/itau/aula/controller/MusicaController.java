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

import br.com.itau.aula.dao.MusicaDAO;
import br.com.itau.aula.model.Artista;
import br.com.itau.aula.model.Musica;

@CrossOrigin("*")
@RestController
public class MusicaController {
	@Autowired
	private MusicaDAO dao;
	
	@GetMapping("/musica/{id}")
	public ResponseEntity<Musica> getMusicaId(@PathVariable int id){
		Musica resposta = dao.findById(id).orElse(null);
		
		if(resposta == null) {
			return ResponseEntity.notFound().build();
		}
		else
		{
			return ResponseEntity.ok(resposta);
		}
	}

	@GetMapping("/musicas")
	public ResponseEntity<List<Musica>> getMusicas(){
		ArrayList<Musica> lista = (ArrayList<Musica>) dao.findAll();
		
		if(lista.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok(lista);
		}
	}


	@PostMapping("/musica/gravar")
	public ResponseEntity<Musica> addMusica(@RequestBody Musica musica){
		try {
			dao.save(musica);
			return ResponseEntity.ok(musica);
		} catch (Exception e) {
			return ResponseEntity.status(500).build();
		}
	}
	
	
}

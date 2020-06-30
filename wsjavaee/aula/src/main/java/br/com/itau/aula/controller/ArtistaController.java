package br.com.itau.aula.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.aula.dao.ArtistaDAO;
import br.com.itau.aula.model.Artista;

@RestController
public class ArtistaController {

	@Autowired
	private ArtistaDAO dao;
	
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> exibirArtistas(){
		ArrayList<Artista> lista = (ArrayList<Artista>) dao.findAll();
		
		if(lista.size() == 0) {
			return ResponseEntity.status(403).build();
		}
		else {
			return ResponseEntity.ok(lista);
		}
	}

	@GetMapping("/artista/{id}")
	public ResponseEntity<Artista> exibirArtistaId(@PathVariable int id){
		Artista resposta = dao.findById(id).orElse(null);
		
		if(resposta == null) {
			return ResponseEntity.status(404).build();
		}
		else
		{
			return ResponseEntity.ok(resposta);
		}
	}
	
	@GetMapping("/artista/nacionalidade/{nacionalidade}")
	public ResponseEntity<List<Artista>> exibirArtistaNacionalidade(@PathVariable String nacionalidade){
		ArrayList<Artista> lista = (ArrayList<Artista>) dao.findByNacionalidade(nacionalidade);
		
		if(lista.size() == 0) {
			return ResponseEntity.status(403).build();
		}
		else {
			return ResponseEntity.ok(lista);
		}
	}

}

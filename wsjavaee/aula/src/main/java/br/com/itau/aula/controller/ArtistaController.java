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

import br.com.itau.aula.dao.ArtistaDAO;
import br.com.itau.aula.model.Artista;

@CrossOrigin("*")
@RestController
public class ArtistaController {

	@Autowired
	private ArtistaDAO dao;
	
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> exibirArtistas(){
		ArrayList<Artista> lista = (ArrayList<Artista>) dao.findAll();
		
		if(lista.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok(lista);
		}
	}

	@GetMapping("/artista/{id}")
	public ResponseEntity<Artista> exibirArtistaId(@PathVariable int id){
		Artista resposta = dao.findById(id).orElse(null);
		
		if(resposta == null) {
			return ResponseEntity.notFound().build();
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
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok(lista);
		}
	}
	
	@PostMapping("/artista/gravar")
	public ResponseEntity<Artista> gravarArtista(@RequestBody Artista artista){
		try {
			dao.save(artista);
			return ResponseEntity.ok(artista);
		}
		catch(Exception e) {
			return ResponseEntity.status(500).build();
		}
	}
	
	

}

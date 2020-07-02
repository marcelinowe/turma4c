package br.com.grupo1.fso.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.grupo1.fso.dao.AgenteFinanceiroDAO;
import br.com.grupo1.fso.model.AgenteFinanceiro;

@CrossOrigin("*")
@RestController
public class AgenteFinanceiroController {
	@Autowired
	private AgenteFinanceiroDAO dao;
	
	@GetMapping("/agentes")
	public ResponseEntity<List<AgenteFinanceiro>> exibirAgentes(){
		ArrayList<AgenteFinanceiro> lista = (ArrayList<AgenteFinanceiro>) dao.findAll();
		
		if(lista.size() == 0) {
			return ResponseEntity.status(403).build();
		}
		else {
			return ResponseEntity.ok(lista);
		}		
	}
}

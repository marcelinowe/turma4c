package br.com.grupo1.fso.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.grupo1.fso.dao.AgenteFinanceiroDAO;
import br.com.grupo1.fso.dao.TransacaoDAO;
import br.com.grupo1.fso.model.AgenteFinanceiro;
import br.com.grupo1.fso.model.Transacao;


@CrossOrigin("*")
@RestController
public class AgenteFinanceiroController {
	@Autowired
	private AgenteFinanceiroDAO dao;
	
	@Autowired
	private TransacaoDAO dao2;
	
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
	@GetMapping("/agentestop10")
	public ResponseEntity<List<AgenteFinanceiro>> exibirAgentesTop10(){
		ArrayList<AgenteFinanceiro> lista = (ArrayList<AgenteFinanceiro>) dao.findTop10ByOrderByVolumeTransacionalDesc();
		
		if(lista.size() == 0) {
			return ResponseEntity.status(403).build();
		}
		else {
			return ResponseEntity.ok(lista);
		}		
	}

	@GetMapping("/agente/{id}")
	public ResponseEntity<AgenteFinanceiro> exibirArtistaId(@PathVariable int id){
		AgenteFinanceiro resposta = dao.findById(id).orElse(null);
		int totalSucesso = 0;
		int totalFalha = 0;
		int totalFraude = 0;
		if(resposta == null) {
			return ResponseEntity.notFound().build();
		}
		else
		{
			/*
			resposta.setTotalsucesso(dao2.findByAgenteFinanceiroAndStatus(id, 0));
			resposta.setTotalfalha(dao2.findByAgenteFinanceiroAndStatus(id, 1));
			resposta.setTotalfraude(dao2.findByAgenteFinanceiroAndStatus(id, 2));
			*/
			
			for (Transacao tra : resposta.getTransacoes()) {
				if(tra.getStatus()==0) {
					totalSucesso += 1;
				}else if(tra.getStatus()==1) {
					totalFalha += 1;
				}else if(tra.getStatus()==2) {
					totalFraude += 1;
				}
			}
			resposta.setTotalsucesso(totalSucesso);
			resposta.setTotalfalha(totalFalha);
			resposta.setTotalfraude(totalFraude);
			
			return ResponseEntity.ok(resposta);
		}
	}	
}

package br.com.grupo1.fso.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.grupo1.fso.model.Transacao;

public interface TransacaoDAO extends CrudRepository<Transacao,Integer>{

	@Query(value="select count(0) as totalsucesso from mtb310_transaction where agente_financeiro_id_agente = ?1 and status = ?2",nativeQuery = true)
	int findByAgenteFinanceiroAndStatus(int agenteFinanceiro, int status);
}

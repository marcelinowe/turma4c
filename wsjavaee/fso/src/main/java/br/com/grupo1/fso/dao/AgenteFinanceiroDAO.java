package br.com.grupo1.fso.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.grupo1.fso.model.AgenteFinanceiro;

public interface AgenteFinanceiroDAO extends CrudRepository<AgenteFinanceiro,Integer>{
	public List<AgenteFinanceiro> findAllByOrderByVolumeTransacionalDesc();
	public List<AgenteFinanceiro> findTop10ByOrderByVolumeTransacionalDesc();
}

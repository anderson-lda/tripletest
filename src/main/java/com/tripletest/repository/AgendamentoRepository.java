package com.tripletest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tripletest.entity.Agendamento;

//@Repository
//public interface AgendamentoRepository extends JpaRepository<Agendamento,Integer> {

public interface AgendamentoRepository extends CrudRepository<Agendamento, String> {

//	public boolean existsByDatainicio(String datainicio);
//	
//	public List<Agendamento> findByDatainicio(String datainicio);
//	
//	@Query("select max(g.id) from Agendamento g")
//	public Integer findMaxId();
	
}

package com.tripletest.repository;

import org.springframework.data.repository.CrudRepository;

import com.tripletest.entity.Agendamento;

//@Repository
//public interface AgendamentoRepository extends JpaRepository<Agendamento,Integer> {

public interface AgendamentoRepository extends CrudRepository<Agendamento, String> {

		Agendamento findById(Integer id);
	
}

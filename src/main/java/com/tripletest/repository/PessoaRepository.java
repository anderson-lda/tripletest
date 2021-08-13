package com.tripletest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tripletest.entity.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Integer> {

	public boolean existsByEmail(String email);
	
	public List<Pessoa> findByEmail(String email);
	
	@Query("select max(p.id) from Pessoa p")
	public Integer findMaxId();
	
}

package com.tripletest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripletest.entity.Pessoa;
import com.tripletest.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
    private PessoaRepository pessoaRepository;

    @Transactional
    public String createPessoa(Pessoa pessoa){
        try {
            if (!pessoaRepository.existsByEmail(pessoa.getEmail())){
                pessoa.setId(null == pessoaRepository.findMaxId()? 0 : pessoaRepository.findMaxId() + 1);
                pessoaRepository.save(pessoa);
                return "pessoa record created successfully.";
            }else {
                return "pessoa already exists in the database.";
            }
        }catch (Exception e){
            throw e;
        }
    }

    public List<Pessoa> readPessoas(){
        return pessoaRepository.findAll();
    }

    @Transactional
    public String updatePessoa(Pessoa pessoa){
        if (pessoaRepository.existsByEmail(pessoa.getEmail())){
            try {
                List<Pessoa> pessoas = pessoaRepository.findByEmail(pessoa.getEmail());
                pessoas.stream().forEach(s -> {
                    Pessoa pessoaToBeUpdate = pessoaRepository.findById(s.getId()).get();
                    pessoaToBeUpdate.setNome(pessoa.getNome());
                    pessoaToBeUpdate.setEmail(pessoa.getEmail());
                    pessoaToBeUpdate.setDatadenascimento(pessoa.getDatadenascimento());
                    pessoaToBeUpdate.setTelefone(pessoa.getTelefone());
                    pessoaRepository.save(pessoaToBeUpdate);
                });
                return "pessoa record updated.";
            }catch (Exception e){
                throw e;
            }
        }else {
            return "pessoa does not exists in the database.";
        }
    }

    @Transactional
    public String deletePessoa(Pessoa pessoa){
        if (pessoaRepository.existsByEmail(pessoa.getEmail())){
            try {
                List<Pessoa> pessoas = pessoaRepository.findByEmail(pessoa.getEmail());
                pessoas.stream().forEach(s -> {
                    pessoaRepository.delete(s);
                });
                return "pessoa record deleted successfully.";
            }catch (Exception e){
                throw e;
            }

        }else {
            return "pessoa does not exist";
        }
    }
	
}

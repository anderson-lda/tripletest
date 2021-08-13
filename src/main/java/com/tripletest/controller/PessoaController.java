package com.tripletest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tripletest.entity.Pessoa;
import com.tripletest.service.PessoaService;

@RestController
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(value="info",method=RequestMethod.GET)
	public String info() {
		return "info...";
	}
	
	@RequestMapping(value="createpessoa", method=RequestMethod.POST)
	public String createPessoa(@RequestBody Pessoa pessoa) {
		return pessoaService.createPessoa(pessoa);
	}
	
	@RequestMapping(value="readpessoas",method=RequestMethod.GET)
	public List<Pessoa> readPessoas(){
		return pessoaService.readPessoas();
	}
	
	@RequestMapping(value = "updatepessoa",method=RequestMethod.PUT)
	public String updatePessoa(@RequestBody Pessoa pessoa) {
		return pessoaService.updatePessoa(pessoa);
	}
	
	@RequestMapping(value="deletepessoa",method=RequestMethod.DELETE)
	public String deletePessoa(@RequestBody Pessoa pessoa) {
		return pessoaService.deletePessoa(pessoa);
	}
	
}

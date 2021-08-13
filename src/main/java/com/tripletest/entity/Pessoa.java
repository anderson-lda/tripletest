package com.tripletest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
	@Id
	private Integer id;
	private String nome;
	private String datadenascimento;
	private String email;
	private String telefone;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDatadenascimento() {
		return datadenascimento;
	}
	public void setDatadenascimento(String datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", datadenascimento=" + datadenascimento + ", email=" + email
				+ ", telefone=" + telefone + "]";
	}
	public Pessoa() {
		
	}
	
	

}

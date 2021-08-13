package com.tripletest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

//import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Agendamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
//	@NotEmpty
	private String local;
//	@NotEmpty
	private String datainicio;
//	@NotEmpty
	private String datafim;
	
	public Agendamento() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}

	public String getDatafim() {
		return datafim;
	}

	public void setDatafim(String datafim) {
		this.datafim = datafim;
	}

	@Override
	public String toString() {
		return "Agendamento [id=" + id + ", local=" + local + ", datainicio=" + datainicio + ", datafim=" + datafim
				+ "]";
	}
	
	

}

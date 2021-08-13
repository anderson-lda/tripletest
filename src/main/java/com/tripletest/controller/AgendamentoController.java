package com.tripletest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tripletest.entity.Agendamento;
import com.tripletest.repository.AgendamentoRepository;


@Controller
public class AgendamentoController {
	
	@Autowired
	private AgendamentoRepository ar;

	@RequestMapping(value="/cadastrarAgendamento",method=RequestMethod.GET)
	public String form() {
		return "agendamento/formAgendamento";
	}
	
	@RequestMapping(value="/cadastrarAgendamento",method=RequestMethod.POST)
	public String form(Agendamento agendamento) {
		ar.save(agendamento);
		return "redirect:/cadastrarAgendamento";
	}
	
	@RequestMapping("/agendamento")
	public ModelAndView listaAgendamentos() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Agendamento> agendamentos = ar.findAll();
		mv.addObject("agendamentos",agendamentos);
		return mv;
	}
	
	@RequestMapping("/{id}")
	public ModelAndView detalhesConsulta(@PathVariable("id") Integer id) {
		Agendamento agendamento = ar.findById(id);
		ModelAndView mv = new ModelAndView("agendamento/detalhesConsulta");
		mv.addObject("agendamento",agendamento);
		return mv;
		
	}
}

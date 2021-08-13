package com.tripletest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tripletest.entity.Agendamento;
import com.tripletest.repository.AgendamentoRepository;


@Controller
public class AgendamentoController {

//	@Autowired
//	private AgendamentoService agendamentoService;
//	
//	@RequestMapping(value="info2",method=RequestMethod.GET)
//	public String info() {
//		return "info...";
//	}
//	
//	@RequestMapping(value="createagendamento", method=RequestMethod.POST)
//	public String createAgendamento(@RequestBody Agendamento agendamento) {
//		return agendamentoService.createAgendamento(agendamento);
//	}
//	
//	@RequestMapping(value="readagendamentos",method=RequestMethod.GET)
//	public List<Agendamento> readAgendamentos(){
//		return agendamentoService.readAgendamentos();
//	}
//	
//	@RequestMapping(value = "updateagendamento",method=RequestMethod.PUT)
//	public String updateAgendamento(@RequestBody Agendamento agendamento) {
//		return agendamentoService.updateAgendamento(agendamento);
//	}
//	
//	@RequestMapping(value="deleteagendamento",method=RequestMethod.DELETE)
//	public String deleteAgendamento(@RequestBody Agendamento agendamento) {
//		return agendamentoService.deleteAgendamento(agendamento);
//	}
	
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
}

package com.tripletest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripletest.entity.Agendamento;
import com.tripletest.repository.AgendamentoRepository;

//@Service
public class AgendamentoService {
	
//	@Autowired
//    private AgendamentoRepository agendamentoRepository;
//
//    @Transactional
//    public String createAgendamento(Agendamento agendamento){
//        try {
//            if (!agendamentoRepository.existsByDatainicio(agendamento.getDatainicio())){
//                agendamento.setId(null == agendamentoRepository.findMaxId()? 0 : agendamentoRepository.findMaxId() + 1);
//                agendamentoRepository.save(agendamento);
//                return "agendamento record created successfully.";
//            }else {
//                return "agendamento already exists in the database.";
//            }
//        }catch (Exception e){
//            throw e;
//        }
//    }
//
//    public List<Agendamento> readAgendamentos(){
//        return agendamentoRepository.findAll();
//    }
//
//    @Transactional
//    public String updateAgendamento(Agendamento agendamento){
//        if (agendamentoRepository.existsByDatainicio(agendamento.getDatainicio())){
//            try {
//                List<Agendamento> agendamentos = agendamentoRepository.findByDatainicio(agendamento.getDatainicio());
//                agendamentos.stream().forEach(s -> {
//                    Agendamento agendamentoToBeUpdate = agendamentoRepository.findById(s.getId()).get();
//                    agendamentoToBeUpdate.setLocal(agendamento.getLocal());
//                    agendamentoToBeUpdate.setDatainicio(agendamento.getDatainicio());
//                    agendamentoToBeUpdate.setDatafim(agendamento.getDatafim());
//                    agendamentoRepository.save(agendamentoToBeUpdate);
//                });
//                return "agendamento record updated.";
//            }catch (Exception e){
//                throw e;
//            }
//        }else {
//            return "agendamento does not exists in the database.";
//        }
//    }
//
//    @Transactional
//    public String deleteAgendamento(Agendamento agendamento){
//        if (agendamentoRepository.existsByDatainicio(agendamento.getDatainicio())){
//            try {
//                List<Agendamento> agendamentos = agendamentoRepository.findByDatainicio(agendamento.getDatainicio());
//                agendamentos.stream().forEach(s -> {
//                    agendamentoRepository.delete(s);
//                });
//                return "agendamento record deleted successfully.";
//            }catch (Exception e){
//                throw e;
//            }
//
//        }else {
//            return "agendamento does not exist";
//        }
//    }

}

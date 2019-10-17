package br.edu.ifpb.pweb2.praticaspringbootdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.pweb2.praticaspringbootdatajpa.entity.Turma;
import br.edu.ifpb.pweb2.praticaspringbootdatajpa.repository.TurmaRepository;

@Controller
@RequestMapping("/turmas")
public class TurmaController {
	
	@Autowired 
	private TurmaRepository repository;
	
	@RequestMapping
	public ModelAndView list(String disciplina) {
	ModelAndView model = new ModelAndView("turma/turmas");
	List<Turma> turmas = repository.findAll();
	model.addObject("turmas" , turmas);
	return model;
	}
	
	
}


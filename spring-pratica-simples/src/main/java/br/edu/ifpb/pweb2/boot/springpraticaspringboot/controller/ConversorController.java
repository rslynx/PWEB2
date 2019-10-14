package br.edu.ifpb.pweb2.boot.springpraticaspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConversorController {
	
	private double temperatura;
	
	@GetMapping("/conversor")
	public String tempForm(Model model) {
		model.addAttribute("temperatura");
		return "tempForm";
	}
	
	
	@PostMapping("/conversor")
	public String celciusToF(Model model, String temp) {
		temperatura = (Double.parseDouble(temp));
		double tempfinal; 
		tempfinal = 5/9 * (temperatura - 32);		
		model.addAttribute("temperatura", tempfinal);
		return "formTemp";
	}
}

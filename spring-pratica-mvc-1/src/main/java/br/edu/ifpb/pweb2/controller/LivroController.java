package br.edu.ifpb.pweb2.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpb.pweb2.model.Livro;

@Controller
@RequestMapping("/livros")
public class LivroController {

	@RequestMapping("/form")
	public String showForm(Livro livro, Model model) {
		model.addAttribute("estiloOptions", this.getEstiloOption());
		return "livros-form";
	}
	
	private Map<String, String> getEstiloOption(){
		LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
		options.put("Romance", "Romance");
		options.put("Terror", "Terror");
		options.put("Suspense", "Suspense");
		options.put("Drama", "Drama");
		options.put("Ciências", "Ciências");
		return options;
	}
}

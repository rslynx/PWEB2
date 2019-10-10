package br.edu.ifpb.pweb2.carrinho.controller;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;

import br.edu.ifpb.pweb2.carrinho.model.Carrinho;

@Controller
@RequestMapping("/carrinho")
@Scope(value=WebApplicationContext.SCOPE_REQUEST)
public class CarrinhoController {

	@RequestMapping(method=RequestMethod.POST)
	public String addCarrinho(String id , Integer numItens, HttpSession session) {
		Carrinho carrinho = (Carrinho) session.getAttribute("carrinho");	
		if (carrinho == null) {
			carrinho = new Carrinho();
		}
		
		if (numItens == null) {
			carrinho.adicioneItem(id);
		} else {
			carrinho.setQtdeItens(id, numItens);
		}
		
		session.setAttribute("carrinho", carrinho);
		return "redirect:carrinho";
	}
}

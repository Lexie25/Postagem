package com.br.face.zup.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.br.face.zup.Models.PostagemModel;
import com.br.face.zup.Service.PostagemService;

@Controller
public class PostagemController {
	@Autowired
	PostagemService postagemService;

	@GetMapping
	public ModelAndView mostrarPostagens(){
		ModelAndView modelAndView = new ModelAndView("postagens.html");
		modelAndView.addObject("postagens",postagemService.retornarPostagens());
		
		return modelAndView;

	}
	@PostMapping
	public String salvarPostagem(PostagemModel postagemModel) {
		postagemService.salvarPostagem(postagemModel);
		return "redirect:/";
	}


}

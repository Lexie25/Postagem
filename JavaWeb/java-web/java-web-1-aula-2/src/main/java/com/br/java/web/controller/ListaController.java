package com.br.java.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.java.web.service.ListaService;

@Controller
public class ListaController {
	@Autowired
	ListaService listaService ;
	@RequestMapping
	@ResponseBody
	public List<String> ShowLista(){

		return listaService.mostrarLista();

	} 
	@RequestMapping("/{nome}")
	@ResponseBody
	public String buscarNome(@PathVariable String nome) {
		return listaService.buscarNome(nome);
	}
	@RequestMapping("/delete/{nome}")
	@ResponseBody
	public String ApagarNome(@PathVariable String nome) {
		return listaService.deleteName(nome);
		
	}
	@RequestMapping("/adicionar/{nome}")
	@ResponseBody
 public String adicionarNome(@PathVariable String nome) {
		return listaService.adicionarNome(nome);
	 
 }

}

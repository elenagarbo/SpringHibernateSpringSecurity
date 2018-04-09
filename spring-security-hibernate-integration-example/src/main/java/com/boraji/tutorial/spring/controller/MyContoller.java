package com.boraji.tutorial.spring.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyContoller {

	@GetMapping("/")
	public String index(Model model, Principal principal) {
//		model.addAttribute("message", "You are logged in as " + principal.getName());
		return "index";
	}

	@GetMapping("/noticias")
	public String noticias(Model model, Principal principal) {
//		model.addAttribute("message", "Estas en noticias " + principal.getName());
		return "noticias";
	}

	@GetMapping("/contacto")
	public String contacto(Model model) {
		// model.addAttribute("message", "You are logged in as " + principal.getName());
		return "contacto";
	}

	@GetMapping("/privado")
	public String privado(Model model) {
		// model.addAttribute("message", "You are logged in as " + principal.getName());
		return "privado";
	}
	@GetMapping("/administracion")
	public String administracion(Model model) {
		// model.addAttribute("message", "You are logged in as " + principal.getName());
		return "administracion";
	}

}

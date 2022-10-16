package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PrincipalControlador {
	
	@GetMapping("/votappG62")
	public String principal() {
		return "/index";
	}
	
	@GetMapping("/partidos")
	public String partidosPol() {
		return "/partidos";
	}

}

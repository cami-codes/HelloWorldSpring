package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<b><u>Mentalidade de crescimento <br /> <b>Persistência <br />"
				+ "Responsabilidade pessoal <br /> Orientação ao futuro <br />"
				+ "Comunicação <br /> Orientação ao detalhe <br /> "
				+ "Proatividade <br /> Trabalho em equipe </b></u>";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Meu <b><i>objetivo</b></i> para essa semana é aprender mais sobre o Spring Boot e entender/praticar"
				+ " todos os conceitos que me forem passados!";
	}
	
}


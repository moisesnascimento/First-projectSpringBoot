package com.teste.teste.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
   
	@RequestMapping("/teste")
	public String form() {
		return "evento/formEvento";
	}
}

package com.teste.teste.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClasseController {
	
	@RequestMapping(path = "/")
	public String index() {
		return "index";
	}
}
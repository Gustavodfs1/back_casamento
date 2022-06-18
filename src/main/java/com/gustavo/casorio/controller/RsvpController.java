package com.gustavo.casorio.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.casorio.model.Rsvp;
import com.gustavo.casorio.service.Service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@RestController
@NoArgsConstructor
@Getter
@Setter
public class RsvpController {

	@CrossOrigin
	@PostMapping(path = "/api/rsvp")
	public String rsvp(@RequestBody Rsvp json) {
		String email = "e-mail enviado com Sucesso";
		try {
			Service.montaEmail(json);
		} catch (Exception e) {
			e.printStackTrace();
			email = "ERRO - e-mail não enviado!!!!";
		}

		return email;
	}
	
	@CrossOrigin
	@GetMapping(path = "/api/teste")
	public String teste() {

		return "Está acessando a aplicação :)";
	}
}

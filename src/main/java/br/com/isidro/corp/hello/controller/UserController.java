package br.com.isidro.corp.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidro.corp.hello.model.Usuario;

@RestController
public class UserController {

	@PostMapping("/login")
	public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario dadosLogin) {
		if (dadosLogin.getRacf().equals("isidro")) {
			if (dadosLogin.getSenha().equals("1234")) {
				Usuario resposta = new Usuario();
				resposta.setId(36854);
				;
				resposta.setNome("Professor isidro");
				;
				resposta.setEmail("isisdro@isidro.com");
				resposta.setRacf("isidro");
				resposta.setFuncional("96854712354");
				return ResponseEntity.ok(resposta);
			}
			return ResponseEntity.status(401).build();
		}
		return ResponseEntity.status(404).build();
	}

}

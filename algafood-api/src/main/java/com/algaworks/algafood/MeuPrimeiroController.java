package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("Meu Primeiro Controller: " + ativacaoClienteService);
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String Hello() {
		ativacaoClienteService.ativar(new Cliente("Bruno", "bruno@email.ie", "11 956872364"));
		return "Hello!";
		
	}
}

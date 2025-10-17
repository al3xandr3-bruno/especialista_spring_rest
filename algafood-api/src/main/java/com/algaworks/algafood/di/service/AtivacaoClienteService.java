package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.SEM_PRIORIDADE)
	@Autowired
	private Notificador notificador;

//	@PostConstruct
	public void init(){
		System.out.println("INIT" + notificador);
	}

	//@PreDestroy
	public void destroy(){
		System.out.println("DESTROY");
	}
	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "O cadastro no sistema está ativo");
	}
}

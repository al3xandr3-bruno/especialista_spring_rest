package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorSMS implements Notificador {

	//não precisamos definir um construtor, uma vez que ele seria vazio de qualquer jeio

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do telefone %s: %s\n",
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}

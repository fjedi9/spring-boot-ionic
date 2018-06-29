package com.vepilef.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.vepilef.cursomc.domain.Cliente;
import com.vepilef.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}

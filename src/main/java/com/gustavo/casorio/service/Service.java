package com.gustavo.casorio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.gustavo.casorio.config.EmailConfig;
import com.gustavo.casorio.model.Convidado;
import com.gustavo.casorio.model.Rsvp;
import com.gustavo.casorio.repository.ConvidadoRepository;

import lombok.NoArgsConstructor;

@org.springframework.stereotype.Service
@NoArgsConstructor
@Component
public class Service{

	
	private static ConvidadoRepository repository;
	
	
	static Convidado convidado = new Convidado();
	public Service(ConvidadoRepository repository) {
		this.repository = repository;
	}

	@Autowired
    private static JavaMailSender emailSender;
	

	public static void montaEmail(Rsvp json) {
		Rsvp rsvp = new Rsvp();
		convidado.setNome(json.getNome());
		convidado.setAcompanhantes(json.getAcompanhantes());
		convidado.setMensagem(json.getMensagem());

		StringBuilder mensagem = new StringBuilder();
		mensagem.append(" O convidado: ");
		mensagem.append(convidado.getNome().toUpperCase());
		mensagem.append(" esta confirmando sua presença juntamente com: ");
		mensagem.append(convidado.getAcompanhantes());
		mensagem.append(" acompanhantes ");	
		mensagem.append(" e deixaram a mensagem: ");
		mensagem.append(convidado.getMensagem().toUpperCase());

		
		
		//repository.save(convidado);
		
		sendMail(mensagem.toString(), convidado.getNome());

	}

	public static String sendMail(String mensagem, String nome) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setText(mensagem);
		message.setSubject("Confirmação de convidado - rsvp " + "  " + nome.toUpperCase() );
		message.setCc("vvbadeborah@gmail.com");
		message.setCc("guedehcasorio@gmail.com");
		message.setTo("gustavodfs@gmail.com");
		message.setFrom("gustavodfs@gmail.com");

		try {
			EmailConfig.getJavaMailSender().send(message);
			return "Email enviado com sucesso!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Erro ao enviar email.";
		}
	}

}

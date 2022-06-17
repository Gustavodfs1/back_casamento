package com.gustavo.casorio.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Rsvp {

	
	private String nomeConvidado;
	private int acompanhantes;
	private String mensagem;
	/**
	 * @return the nomeConvidado
	 */
	public String getNomeConvidado() {
		return nomeConvidado;
	}
	/**
	 * @param nomeConvidado the nomeConvidado to set
	 */
	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}
	/**
	 * @return the nomeAcompanhante1
	 */
	
	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}
	/**
	 * @param mensagem the mensagem to set
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public int getAcompanhantes() {
		return acompanhantes;
	}
	public void setAcompanhantes(int acompanhantes) {
		this.acompanhantes = acompanhantes;
	}
	
	
}

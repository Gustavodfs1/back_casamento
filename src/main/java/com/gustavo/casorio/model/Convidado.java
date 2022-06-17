package com.gustavo.casorio.model;

import javax.persistence.*;

@Entity
@Table(name = "CONVIDADO")
public class Convidado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;

	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "Acompanhantes")
	private int acompanhantes;
	
	@Column(name = "mensagem")
	private String mensagem;

	public Convidado() {

	}
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMensagem() {
		return mensagem;
	}

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
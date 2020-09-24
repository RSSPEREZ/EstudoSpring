package br.com.rfei.controller;

import java.time.LocalDateTime;
import java.util.List;

import br.com.rfei.model.Sorteio;

public class SorteioDto {

	private Long id;
	private String nome;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public SorteioDto(Sorteio sorteio) {
		this.id = sorteio.getId();
		this.dataCriacao = sorteio.getDataSorteio();
		this.nome = sorteio.getNome();
	}
	
	
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return nome;
	}


	public String getMensagem() {
		return mensagem;
	}

	public List<SorteioDto> converter(List<SorteioDto> asList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

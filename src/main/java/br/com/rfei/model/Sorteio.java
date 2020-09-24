package br.com.rfei.model;

import java.time.LocalDateTime;

public class Sorteio {
	
	private LocalDateTime dataAbertura;
	private LocalDateTime dataFechamento;
	private LocalDateTime dataSorteio;
	private Long id;
	private int numero;
	private String nome;
	
	
	public Sorteio(String nome, long id){
		this.nome = nome;
		this.id = id;
	}
	
	public LocalDateTime getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(LocalDateTime dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public LocalDateTime getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(LocalDateTime dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	public LocalDateTime getDataSorteio() {
		return dataSorteio;
	}
	public void setDataSorteio(LocalDateTime dataSorteio) {
		this.dataSorteio = dataSorteio;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

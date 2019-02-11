package br.com.fiap.beans;

import java.util.Date;

public class Pessoa {
	private String nome;
	
	private String cpf;
	
	private Genero sexo;
	
	@Deprecated // método obsoleto
	public void cadastrar() {
		new Date("");
	}

	public Pessoa() {
	}
	
	public Pessoa(String cpf, String nome) {
		super();
		this.nome = nome;
		this.setCpf(cpf);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Genero getSexo() {
		return sexo;
	}

	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}
}

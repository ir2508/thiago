package br.com.fiap.bean;

import br.com.fiap.anotacoes.Coluna;


public class Carro {

	@Coluna(nome = "ds_modelo", tipo = "VARCHAR2", obrigatorio = true)
	private String modelo;

	@Coluna (nome = "ds_cor", tipo="VARCHAR2")
	private String cor;

	@Coluna(nome="nr_ano", tipo="NUMBER")
	private int ano;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Carro(String modelo, String cor, int ano) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}

	public Carro() {
		super();
	}

}

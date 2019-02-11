package br.com.fiap.beans;

public class Aluno extends Pessoa{
	private String rm;
	
	public Aluno (String nome, String cpf) {
		super(nome, cpf);
	}
	
	@Override
	public void cadastrar() {
		
	}
	
	public String getRm() {
		return rm;
	}
	
	public void setRm(String rm) {
		this.rm = rm;
	}
}

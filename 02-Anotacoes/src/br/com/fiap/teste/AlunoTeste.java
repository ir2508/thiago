package br.com.fiap.teste;

import br.com.fiap.anotacoes.Tabela;
import br.com.fiap.bean.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		selecionar(aluno);
	}

	public static void selecionar(Object obj) {
		Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
		System.out.println("SELECT * FROM " + anotacao.nome);
	}
}

package br.com.fiap.teste;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Genero;

public class Teste {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		// Instanciar um aluno
		Aluno aluno = new Aluno("Marcus", "323213039");
		
		//Atribuir um valor para o genero
		aluno.setSexo(Genero.MASCULINO);
	}

}

package br.com.fiap.teste;

import java.lang.reflect.Field;

import br.com.fiap.anotacoes.Coluna;
import br.com.fiap.bean.Carro;

public class Teste {
	
	public static void main(String[] args) {
		//Instanciar um carro
		Carro carro = new Carro();
		criarTabela(carro);
	}
	
	/**
	 * @param obj
	 */
	public static void criarTabela(Object obj) {
		//API Reflection vamos recuperar o nome da classe
		String nome = obj.getClass().getName();
		System.out.println(nome);
		
		//Recuperar os atributos da classe
		Field[] atributos = obj.getClass().getDeclaredFields();
		for (Field f: atributos) {
			System.out.println(f.getName());
			//Recuperar a anotação @Coluna
			Coluna anotacao = f.getAnnotation(Coluna.class);
			System.out.println("Nome: "+ anotacao.nome());
			System.out.println("Tipo: "+ anotacao.tipo());
			System.out.println("Obrigatorio: "+ anotacao.obrigatorio());
		}
	}
		
}

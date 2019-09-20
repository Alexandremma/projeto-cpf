package com.db1.cpf.heranca;

public class Professor extends Pessoa {
	//Atributos
	private String setor;
	
	private boolean trabalhando;
	
	//Métodos
	public void mudarTrabalho() {
		
	}
	
	public void ensinarConteudo() {
		
	}
	
	//Métodos especiais
	public Professor() {
		
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
}

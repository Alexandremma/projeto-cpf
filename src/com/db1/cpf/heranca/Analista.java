package com.db1.cpf.heranca;

public class Analista extends Funcionario {

	private String nivel;
	
	//Métodos
	public void analisar() {
		System.out.println("Analisando...");
	}
	
	//Métodos especiais
	public Analista(double salario) {
		this.setSalario(salario);
	}
	
	public String getNivel() {
		return nivel;
	}
	
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
}

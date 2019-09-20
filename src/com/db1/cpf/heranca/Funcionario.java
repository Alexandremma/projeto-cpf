package com.db1.cpf.heranca;

public abstract class Funcionario extends Pessoa {
	
	private String setor;
	
	private double salario;
	
	private boolean bonificado;

	//Métodos
	public void aumentoDeSalario() {
		this.setSalario(this.getSalario() * 1.1);
	}
	
	//Métodos especiais
	public Funcionario() {
		
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isBonificado() {
		return bonificado;
	}

	public void setBonificado(boolean bonificado) {
		this.bonificado = bonificado;
	}
	
}

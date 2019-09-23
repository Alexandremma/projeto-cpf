package com.db1.cpf.heranca;

public class Gerente extends Funcionario {

	private boolean executivo;
	
	private int numFuncionariosGerenciados;
	
	//M�todos
	public void gerenciarFuncionarios() {
		System.out.println("Gerenciando funcion�rios");
	}
	
	//M�todos especiais
	public Gerente() {
		
	}
	
	public boolean isExecutivo() {
		return executivo;
	}
	
	public void setExecutivo(boolean executivo) {
		this.executivo = executivo;
	}
	
	public int getNumFuncionariosGerenciados() {
		return numFuncionariosGerenciados;
	}
	
	public void setNumFuncionariosGerenciados(int numFuncionariosGerenciados) {
		this.numFuncionariosGerenciados = numFuncionariosGerenciados;
	}
	
}

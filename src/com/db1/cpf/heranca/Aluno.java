package com.db1.cpf.heranca;

public class Aluno extends Pessoa {
	//Atributos
	private String matricula;
	
	private String curso;
	
	//M�todos
	public void cancelarMatricula() {
		
	}
	
	//M�todos especiais
	public Aluno() {
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}

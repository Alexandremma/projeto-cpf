package com.db1.cpf.heranca;

public class Aluno extends Pessoa {
	//Atributos
	private String matricula;
	
	private String curso;
	
	//M�todos
	public void cancelarMatricula() {
		System.out.println("Cancelando matr�cula...");
	}
	
	public void assistirAula() {
		System.out.println("Assistindo aula...");
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

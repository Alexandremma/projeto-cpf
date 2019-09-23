package com.db1.cpf.polimorfismo;

public class Mamifero extends AnimalAtributos {
	//Atributos
	private String corPelo;

	//Implementando métodos da Interface
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero");
	}

	//Métodos especiais
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
}

package com.db1.cpf.polimorfismo;

public class Reptil extends AnimalAtributos {
	//Atributos
	private String corEscama;

	//Implementando métodos da Interface
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo carne e plantas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Réptil");
	}
	
	//Métodos especiais
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}

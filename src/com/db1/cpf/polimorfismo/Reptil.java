package com.db1.cpf.polimorfismo;

public class Reptil extends AnimalAtributos {
	//Atributos
	private String corEscama;

	//Implementando m�todos da Interface
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
		System.out.println("Som de R�ptil");
	}
	
	//M�todos especiais
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}

package com.db1.cpf.polimorfismo;

public class Peixe extends AnimalAtributos {
	//Atributos
	private String corEscama;

	//Implementando métodos da Interface
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo peixes e substâncias da água");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de peixe");
	}

	//Métodos especiais
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}

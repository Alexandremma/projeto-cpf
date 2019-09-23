package com.db1.cpf.polimorfismo;

public class Peixe extends AnimalAtributos {
	//Atributos
	private String corEscama;

	//Implementando m�todos da Interface
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo peixes e subst�ncias da �gua");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de peixe");
	}

	//M�todos especiais
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}

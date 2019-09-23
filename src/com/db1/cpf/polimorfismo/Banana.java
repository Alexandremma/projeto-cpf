package com.db1.cpf.polimorfismo;

public class Banana extends Fruta {

	private String tipo;
	
	@Override
	public void descascar() {
		System.out.println("Descascando a banana");
	}
	
}
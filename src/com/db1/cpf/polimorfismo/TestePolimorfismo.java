package com.db1.cpf.polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Mamifero animal1 = new Mamifero();
		Peixe animal2 = new Peixe();
		Reptil animal3 = new Reptil();
		
		Abacaxi fruta1 = new Abacaxi();
		Banana fruta2 = new Banana();
		Laranja fruta3 = new Laranja();
		
		animal1.locomover();
		animal1.emitirSom();
		animal1.alimentar();
		System.out.println("---------");
		animal2.locomover();
		animal2.emitirSom();
		animal2.alimentar();
		System.out.println("---------");
		animal3.locomover();
		animal3.emitirSom();
		animal3.alimentar();
		
		System.out.println("---------");
		fruta1.descascar();
		fruta2.descascar();
		fruta3.descascar();
		
	}
	
}

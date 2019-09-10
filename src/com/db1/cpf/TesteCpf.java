package com.db1.cpf;

public class TesteCpf {
	
	public static void main(String[] args) {
		
		Cpf cpf = new Cpf("108.493.939-81");
		
		cpf.getCpfComMascara();
		
		cpf.getCpfSemMascara();
		
	}
	
}

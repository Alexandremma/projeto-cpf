package com.db1.cpf;

public class Cpf {
	// atributos
	private String cpf;
	
	//construtor
	public Cpf(String cpf) {	
		cpf = cpf.replace(" ", ""); //tira espaços em branco
		cpf = cpf.replace(".", ""); //tira pontos
		cpf = cpf.replace("-", ""); //tira traços
		
		//verificar se CPF válido
		if (verificaCpf(cpf)) {
			this.cpf = cpf;
			System.out.println("CPF inserido");
		} else {
			System.out.println("CPF inválido");
		}
	}
	
	//métodos de get e set
	public void setCpf(String cpf) {
		cpf = cpf.replaceAll(" ", ""); //tira espaços em branco
		cpf = cpf.replaceAll(".", ""); //tira pontos
		cpf = cpf.replaceAll("-", ""); //tira traços
		
		if (verificaCpf(cpf)) {
			this.cpf = cpf;
			System.out.println("CPF inserido");
		} else {
			System.out.println("CPF inválido");
		}
	}
	
	public String getCpfComMascara() {
		String cpfMascara;
		
		cpfMascara = cpf.substring(0, 3) + "." + 
					 cpf.substring(3, 6) + "." + 
					 cpf.substring(6, 9) + "-" +
					 cpf.substring(9, 11);
		
		System.out.println(cpfMascara);
		
		return cpfMascara;
	}
	
	public String getCpfSemMascara() {
		System.out.println(cpf);
		
		return cpf;
	}
	
	//métodos
	public boolean verificaCpf(String cpf) {
		
//		if (cpf == "00000000000" || 
//			cpf == "11111111111" || 
//			cpf == "22222222222" || 
//			cpf == "33333333333" || 
//			cpf == "44444444444" || 
//			cpf == "55555555555" || 
//			cpf == "66666666666" || 
//			cpf == "77777777777" || 
//			cpf == "88888888888" || 
//			cpf == "99999999999" ||
//			cpf.length() != 11 ) {
		if (cpf.equals("00000000000") ||
	        cpf.equals("11111111111") ||
	        cpf.equals("22222222222") || cpf.equals("33333333333") ||
	        cpf.equals("44444444444") || cpf.equals("55555555555") ||
	        cpf.equals("66666666666") || cpf.equals("77777777777") ||
	        cpf.equals("88888888888") || cpf.equals("99999999999") ||
	        (cpf.length() != 11)) {
			System.out.println("Cpf com numeros iguais ou não tem 11 digitos");
			return false;
		}
		
		// --------- analisar numeros verificadores
		// primeiro número
		String subCpf = "";
		int a = 0;
		int b = 1;
		int numeroCpf;
		int peso = 10;
		int multi;
		int soma = 0;
		
		for (int i = 0; i < 9; i++) {
			subCpf = cpf.substring(a, b);
			
			numeroCpf = Integer.parseInt(subCpf);
			
			multi = (peso * numeroCpf);
			
			soma += multi;
			
			a++;
			b++;
			peso--;
		}
		
		int resultado;
		
		resultado = soma % 11;
		
		int verificador = 11 - resultado;
		
		if (verificador > 9) {
			verificador = 0;
		}
		
		int cpfComparador;
		
		cpfComparador = Integer.parseInt(cpf.substring(9, 10)); 
		
		if (verificador != cpfComparador) {
			System.out.println("Primeiro verificador errado");
			return false;
		}
		
		//segundo número
		a = 0;
		b = 1;
		peso = 11;
		soma = 0;
		
		for (int i = 0; i < 10; i++) {
			subCpf = cpf.substring(a, b);
			
			numeroCpf = Integer.parseInt(subCpf);
			
			multi = (peso * numeroCpf);
			
			soma += multi;
			
			a++;
			b++;
			peso--;
		}
		
		resultado = soma % 11;
		
		verificador = 11 - resultado;
		
		if (verificador > 9) {
			verificador = 0;
		}
		
		cpfComparador = Integer.parseInt(cpf.substring(10, 11)); 
		
		if (verificador != cpfComparador) {
			System.out.println("Segundo verificador errado");
			return false;
		}
		
		return true;
	}
}
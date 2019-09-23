package com.db1.cpf.heranca;

public class TesteHeranca {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setIdade(25);
		aluno.setMatricula("1234");
		aluno.assistirAula();
		System.out.println(aluno.getMatricula());
		System.out.println(aluno.getIdade());
		aluno.fazerAniversario();
		
		System.out.println("----------");
		
		Professor professor = new Professor();
		
		professor.setNome("Professor Anderson");
		professor.setSetor("Setor B");
		professor.ensinarConteudo();
		System.out.println(professor.getNome());
		System.out.println(professor.getSetor());
		professor.fazerAniversario();
		
		System.out.println("----------");
		
		Gerente gerente = new Gerente();
		
		gerente.setSalario(205.50);
		gerente.setExecutivo(true);
		System.out.println(gerente.getSalario());
		System.out.println(gerente.isExecutivo());
		gerente.gerenciarFuncionarios();
		gerente.aumentoDeSalario();
		System.out.println(gerente.getSalario());
		
		System.out.println("----------");
		
		Analista analista = new Analista(150.0);
		
		analista.setSetor("Setor C");
		analista.setBonificado(true);
		analista.setNivel("Sênior");
		analista.analisar();
		System.out.println(analista.getSetor());
		System.out.println(analista.isBonificado());
		System.out.println(analista.getNivel());
		
	}
	
}

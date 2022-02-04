package com.escola.br;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		String nome=JOptionPane.showInputDialog("Qual o nome do aluno");
		String idade=JOptionPane.showInputDialog("Qual idade do aluno");
		String dataNascimento=JOptionPane.showInputDialog("Qual a data de nascimento");
		String rg=JOptionPane.showInputDialog("Qual o rg");
		String cpf=JOptionPane.showInputDialog("Qual o cpf");
		String mae=JOptionPane.showInputDialog("Qual o nome da mãe");
		String pai=JOptionPane.showInputDialog("Qual o nome do Pai");
		String matricula=JOptionPane.showInputDialog("Qual a  data da matricula");
		String serie=JOptionPane.showInputDialog("Qual a serie");
		String escola=JOptionPane.showInputDialog("Qual o nome da escola");
		
		
		
		Aluno aluno1= new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
		for(int pos =1; pos<=4; pos++ ) {
			String nomeDisciplina= JOptionPane.showInputDialog("nome da disciplina" +pos+ "?");
			String notaDisciplina= JOptionPane.showInputDialog("nota da disciplina" +pos+ "?");
			
			Disciplina disciplina= new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplina().add(disciplina);
			
		}
		
		
		
		System.out.println("o nome do aluno e:  "+nome);
		System.out.println(aluno1.mediaNota());
		System.out.println("resultado "  + aluno1.getAprovado() != null? "aprovado":"reprovado");
		
		
		
		

	}

}

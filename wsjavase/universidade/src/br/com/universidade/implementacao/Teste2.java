package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Professor;

public class Teste2 {

	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.preencherId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID")));
		professor.preencherContratacao(JOptionPane.showInputDialog("Digite a contrataçao"));
		professor.preencherNome(JOptionPane.showInputDialog("Digite o nome"));
		professor.preencherApelido(JOptionPane.showInputDialog("Digite o apelido"));
		System.out.println(professor.exibirId()+"\n"+professor.exibirContratacao()+"\n"+professor.exibirNome()+"\n"+professor.exibirApelido());
	}

}

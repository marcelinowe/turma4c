package br.com.loja.principal;

import javax.swing.JOptionPane;

import br.com.loja.beans.CD;

public class ImplementarProdutoComHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char opcao = JOptionPane.showInputDialog("Digite:\n<1> CD\n<2> Livro").charAt(0);
		if(opcao == '1') {
			CD cd = new CD();
			
		}else if(opcao == '2') {
			
		}else {
			System.out.println("Opção inválida!!!");
		}			
	}

}

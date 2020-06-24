package br.com.loja.principal;

import javax.swing.JOptionPane;

import br.com.loja.beans.Autor;
import br.com.loja.beans.CD;
import br.com.loja.beans.Livro;

public class ImplementarProdutoComHeranca3 {
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg);
	}

	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char opcao = s("Digite:\n<1> CD\n<2> Livro").charAt(0);
		if(opcao == '1') {
			CD cd = new CD(
					i("Digite o código do CD:"),
					s("Digite a Descrição do CD:"),
					f("Digite o valor de venda do CD:"),
					f("Digite o valor de compra do CD:"),
					s("Digite o nome do artista:"),
					s("Digite a gravadora:")
					);
			System.out.println(cd.getAll());
		}else if(opcao == '2') {
			Livro livro = new Livro();
			livro.setId(i("Digite o código do livro:"));
			livro.setDescricao(s("Digite o nome do livro:"));
			livro.setAutor(new Autor(
					s("Digite o nome academico do autor do livro:"),
					s("Digite o e-mail do autor do livro:"),
					s("Digite o nome artistico do autor do livro:")
						)
					);
			
			System.out.println(livro.getAll());
		}else {
			System.out.println("Opção inválida!!!");
		}			
	}

}

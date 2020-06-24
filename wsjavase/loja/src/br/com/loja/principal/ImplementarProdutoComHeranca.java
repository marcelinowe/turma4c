package br.com.loja.principal;

import javax.swing.JOptionPane;

import br.com.loja.beans.Autor;
import br.com.loja.beans.CD;
import br.com.loja.beans.Livro;

public class ImplementarProdutoComHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char opcao = JOptionPane.showInputDialog("Digite:\n<1> CD\n<2> Livro").charAt(0);
		if(opcao == '1') {
			CD cd = new CD(
					Integer.parseInt(JOptionPane.showInputDialog("Digite o código do CD:")),
					JOptionPane.showInputDialog("Digite a Descrição do CD:"),
					Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de venda do CD:")),
					Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de compra do CD:")),
					JOptionPane.showInputDialog("Digite o nome do artista:"),
					JOptionPane.showInputDialog("Digite a gravadora:")
					);
			System.out.println("Nome do CD....: "+cd.getDescricao());
			System.out.println("Artista.......: "+cd.getArtista());
			System.out.println("Valor de venda: "+cd.getValorVenda());
		}else if(opcao == '2') {
			Livro livro = new Livro();
			livro.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do livro:")));
			livro.setDescricao(JOptionPane.showInputDialog("Digite o nome do livro:"));
			livro.setAutor(new Autor(
					JOptionPane.showInputDialog("Digite o nome academico do autor do livro:"),
					JOptionPane.showInputDialog("Digite o e-mail do autor do livro:"),
					JOptionPane.showInputDialog("Digite o nome artistico do autor do livro:")
						)
					);
			
			
			System.out.println("Código do livro...:"+livro.getId());
			System.out.println("Nome do livro....:"+livro.getDescricao());
			System.out.println("Autor do livro...:"+livro.getAutor().getNome());
		}else {
			System.out.println("Opção inválida!!!");
		}			
	}

}

package br.com.loja.principal;

import br.com.loja.beans.Autor;
import br.com.loja.beans.CD;
import br.com.loja.beans.Livro;
import br.com.loja.beans.Produto;
import br.com.loja.tela.Magica;

public class ImplementarProdutoComHeranca5 {

	public static void main(String[] args) {
		Produto produto = null;
		char opcao = Magica.s("Digite:\n<1> CD\n<2> Livro").charAt(0);
		if(opcao == '1') {
			produto = new CD(
					Magica.i("Digite o código do CD:"),
					Magica.s("Digite a Descrição do CD:"),
					Magica.f("Digite o valor de venda do CD:"),
					Magica.f("Digite o valor de compra do CD:"),
					Magica.s("Digite o nome do artista:"),
					Magica.s("Digite a gravadora:")
					);
		}else if(opcao == '2') {
			produto = new Livro(
					Magica.i("Código do livro:"),
					Magica.s("Nome do livro:"),
					Magica.f("Valor de venda:"),
					Magica.f("Valor de compra:"),
					new Autor(
							Magica.s("Nome academico:"),
							Magica.s("Email:"),
							Magica.s("Nome Artistico:")
							),
					Magica.s("Editora:"),
					Magica.s("ISBN:")
					);
		}else {
			System.out.println("Opção inválida!!!");
		}			
		System.out.println(produto.getAll());
	}
}

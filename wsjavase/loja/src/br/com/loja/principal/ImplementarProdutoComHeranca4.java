package br.com.loja.principal;

import br.com.loja.beans.Autor;
import br.com.loja.beans.CD;
import br.com.loja.beans.Livro;
import br.com.loja.tela.Magica;

public class ImplementarProdutoComHeranca4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char opcao = Magica.s("Digite:\n<1> CD\n<2> Livro").charAt(0);
		if(opcao == '1') {
			CD cd = new CD(
					Magica.i("Digite o código do CD:"),
					Magica.s("Digite a Descrição do CD:"),
					Magica.f("Digite o valor de venda do CD:"),
					Magica.f("Digite o valor de compra do CD:"),
					Magica.s("Digite o nome do artista:"),
					Magica.s("Digite a gravadora:")
					);
			System.out.println(cd.getAll());
		}else if(opcao == '2') {
			Livro livro = new Livro();
			livro.setId(Magica.i("Digite o código do livro:"));
			livro.setDescricao(Magica.s("Digite o nome do livro:"));
			livro.setAutor(new Autor(
					Magica.s("Digite o nome academico do autor do livro:"),
					Magica.s("Digite o e-mail do autor do livro:"),
					Magica.s("Digite o nome artistico do autor do livro:")
						)
					);
			
			System.out.println(livro.getAll());
		}else {
			System.out.println("Opção inválida!!!");
		}			
	}
}

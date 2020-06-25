package br.com.excecao.implementacao;

import br.com.excecao.excecao.Excecao;

public class TesteExcecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = 0;
			x = Integer.parseInt("0");
			
			String a = "";
			System.out.println(a.length());
			
			int[] b = new int[2];
			b[0] = 0;
			b[1] = 1;
			b[2] = 2;
		} catch (Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
		}
	}

}

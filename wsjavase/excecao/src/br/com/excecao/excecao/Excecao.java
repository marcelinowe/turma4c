package br.com.excecao.excecao;

public class Excecao extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String tratarExcecao(Exception e) {
		
		if(e instanceof NullPointerException) {
			return "Objeto nulo";
		}else if(e instanceof NumberFormatException) {
			return "Formato invalido de numero";
		}else if(e instanceof ArrayIndexOutOfBoundsException) {
			return "Posicao de array invalida";
		}
		else {
			return "Excecao desconhecica";
		}
	}
}

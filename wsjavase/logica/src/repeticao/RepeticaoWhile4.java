import javax.swing.JOptionPane;
class RepeticaoWhile4{
	public static void main(String args[]){
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro valor"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo valor"));
		int valorTotal = 0;
		
		int resposta=0;
		while(resposta == 0){
		
			String operador = JOptionPane.showInputDialog("Entre com um operador: + - * ou /");
			if (operador.equals("+")){
				valorTotal = valor1 + valor2;
				System.out.println("A soma dos valores eh: " + valorTotal);
			}else if (operador.equals("-")){
				valorTotal = valor1 - valor2;
				System.out.println("A subtracao dos valores eh: " + valorTotal);
			}else if (operador.equals("*")){
				valorTotal = valor1 * valor2;
				System.out.println("A multiplicacao dos valores eh: " + valorTotal);
			}else if (operador.equals("/")){
				valorTotal = valor1 / valor2;
				System.out.println("A divisao dos valores eh: " + valorTotal);
			}
			else{
				resposta = JOptionPane.showConfirmDialog(null,"Continuar?","Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			}
		}
	}
}
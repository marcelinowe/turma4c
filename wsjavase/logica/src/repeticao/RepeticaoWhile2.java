import javax.swing.JOptionPane;
class RepeticaoWhile2{
	public static void main(String args[]){
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro valor"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo valor"));
		int valorTotal = 0;
		
		char resposta='S';
		while(resposta == 'S'){
		
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
				System.out.println("Operacao INVALIDA");
			}
			resposta = JOptionPane.showInputDialog("Deseja continuar? Sim ou Nao").toUpperCase().charAt(0);
		}
	}
}
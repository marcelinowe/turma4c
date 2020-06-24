//Lista2_Exercicio3
import javax.swing.JOptionPane;
class Calculadora{
	public static void main(String args[]){
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro valor"));
		char operacao = JOptionPane.showInputDialog("Escolha a operacao digitanto o simbolo:\nSoma (+)\nSubtracao (-)\nMultiplicacao (*)\nDivisao (/)").charAt(0);
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo valor"));
		float valorFinal;
		if(operacao == '+'){
			valorFinal = valor1 + valor2;
			System.out.println("A soma de " + valor1 + " e " + valor2 +" é: "+valorFinal);
		}
		else if(operacao == '-'){
			valorFinal = valor1 - valor2;
		}
		else if(operacao == '*'){
			valorFinal = valor1 * valor2;
		}
		else{
			valorFinal = valor1 / valor2;
		}
		System.out.println("Valor da operação de "+operacao+": "+valorFinal);
	}
}
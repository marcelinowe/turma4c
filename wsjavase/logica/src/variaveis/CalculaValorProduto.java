//Lista2_Exercicio2
import javax.swing.JOptionPane;
class CalculaValorProduto{
	public static void main(String args[]){
		float valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto"));
		int opcaoPagamento = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao de pagamento:\n1-A vista em dinheiro ou cheque, 10% de desconto\n2-A vista no cartao de credito, 5% de desconto\n3-Em duas vezes no cartao, preco da etiqueta do produto\n4-Em tres vezes no cartao, preco da etiqueta com 10% de juros"));

		if (opcaoPagamento == 1){
			valorProduto = valorProduto - (valorProduto * ((float)10.0/100));
		}
		else if(opcaoPagamento == 2){
			valorProduto = valorProduto - (valorProduto * ((float)5.0/100));
		}
		else if(opcaoPagamento == 4){
			valorProduto = valorProduto + (valorProduto * ((float)10.0/100));
		}
		System.out.println("Valor final do produto: "+valorProduto);
	}
}
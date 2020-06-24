import javax.swing.JOptionPane;
class RepeticaoWhile{
	public static void main(String args[]){
		String nome = JOptionPane.showInputDialog("Digite seu nome completo");
		while(nome.indexOf(" ") == -1 || nome.length() < 8){
			nome = JOptionPane.showInputDialog("Digite seu nome completo");
		}
		System.out.println("Nome completo: "+nome);
	}
}
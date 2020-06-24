import javax.swing.JOptionPane;
class RepeticaoDo{
	public static void main(String args[]){
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int chute  = 0;
		int tentativas = 0;
		do{
			chute = Integer.parseInt(JOptionPane.showInputDialog("Descubra o numero que foi digitado"));
			tentativas +=1;
		}while(chute!=numero);
		
		System.out.println("Parabens voce acertou com "+tentativas+" tentativas!");		
	}
}
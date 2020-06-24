import javax.swing.JOptionPane;
class DecisaoSimples{
	public static void main(String args[]){

		String email = JOptionPane.showInputDialog("Digite o email");
		if(email.indexOf("@") > -1 && email.length() > 1){
			System.out.println("Servidor do e-mail: " + email.substring(email.indexOf("@")+1));
		}
	}
}
import javax.swing.JOptionPane;
class ManipulaString{
	public static void main(String args[]){
		String email= JOptionPane.showInputDialog("Digite o email:").toLowerCase();
		System.out.println("E-mail: " + email.toLowerCase());
		System.out.println("E-mail: " + email.toUpperCase());
		System.out.println("E-mail Tamanho: " + email.length());
		System.out.println("Parte do e-mail: " + email.substring(1,3));
		int posicaoArroba = email.indexOf("@");
		if(posicaoArroba == -1){
			System.out.println("Prefixo do e-mail: " + email.substring(0));
		}
		else{
		//	System.out.println("Prefixo do e-mail: " + email.substring(0,email.indexOf("@")));
			System.out.println("Prefixo do e-mail: " + email.substring(0,email.indexOf("@")));
			System.out.println("Sufixo do e-mail: " + email.substring(email.indexOf("@")+1));
		}
		
	}
}
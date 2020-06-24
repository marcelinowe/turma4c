import javax.swing.JOptionPane;
class CompararChar{
	public static void main(String args[]){
		char formacao = JOptionPane.showInputDialog("Digite o tipo de formação desejada(T -> TECNOLOGO ou B -> BARACHELADO)").toUpperCase().charAt(0);

		if(formacao=='B'){
			System.out.println("De 4 a 6 anos de duracao");
		}
		else if(formacao=='T'){
			System.out.println("De 2 a 3 anos de duracao");
		}
		else{
			System.out.println("Digite somente BACHARELADO ou TECNOLOGO");
		}
	}
}
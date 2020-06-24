import javax.swing.JOptionPane;
class CompararStrings{
	public static void main(String args[]){
		String formacao = JOptionPane.showInputDialog("Digite o tipo de formação desejada(TECNOLOGO ou BARACHELADO)");

		if(formacao.equals("BACHARELADO")){
			System.out.println("De 4 a 6 anos de duracao");
		}
		else if(formacao.equals("TECNOLOGO")){
			System.out.println("De 2 a 3 anos de duracao");
		}
		else{
			System.out.println("Digite somente BACHARELADO ou TECNOLOGO");
		}
	}
}
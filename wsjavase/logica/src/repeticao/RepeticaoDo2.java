import javax.swing.JOptionPane;
class RepeticaoDo2{
	public static void main(String args[]){
		int continua = 0;
		int masculino = 0;
		int feminino = 0;
		
		char resposta = ' ';
		do{
			resposta = JOptionPane.showInputDialog("Digite o sexo:\n<M> Masculino\n<F> Feminino").toUpperCase().charAt(0);
			continua = JOptionPane.showConfirmDialog(null,"Continuar?","Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if(resposta=='M')
				masculino++;
			else if(resposta == 'F')
				feminino++;

		}while(continua == 0);
		
		System.out.println("Numero de pessoas entrevistadas......: " + (masculino+feminino));
		System.out.println("Total de pessoas do sexo Masculino...: " + masculino);
		System.out.println("Total de pessoas do sexo Feminino....: " + feminino);
	}
}
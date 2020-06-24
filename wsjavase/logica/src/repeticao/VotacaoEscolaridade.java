import javax.swing.JOptionPane;
class VotacaoEscolaridade{
	public static void main(String args[]){
		String nivel = "";
		int medio = 0;
		int superior = 0;
		int pos = 0;
		do{
			nivel = JOptionPane.showInputDialog("Digite o nivel de escolaridade:\nMedio\nSuperior\nPos");
			if(nivel.toLowerCase().equals("medio")){
				medio++;
			}else if(nivel.toLowerCase().equals("superior")){
				superior++;
			}else if(nivel.toLowerCase().equals("pos")){
				pos++;
			}
		}while(JOptionPane.showConfirmDialog(null,"Continuar?","Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0);
		
		if(medio > superior)
		{
			if(superior > pos){
				System.out.println("O nivel de escolaridade mais votado foi Medio com "+medio+" votos");
			}
			else{
				if (medio > pos){
					System.out.println("O nivel de escolaridade mais votado foi Medio com "+medio+" votos");
				}else{
					System.out.println("O nivel de escolaridade mais votado foi Pos com "+pos+" votos");
				}
			}
		}
		else{
			if(superior > pos){
				if(medio > pos){
					System.out.println("O nivel de escolaridade mais votado foi Superior com "+superior+" votos");
				}
				else{
					System.out.println("O nivel de escolaridade mais votado foi Superior com "+superior+" votos");
				}
			}
			else{
				System.out.println("O nivel de escolaridade mais votado foi Pos com "+pos+" votos");
			}
		}
	}
}
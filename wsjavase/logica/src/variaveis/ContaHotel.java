//Lista2_Exercicio1
import javax.swing.JOptionPane;
class ContaHotel{
	public static void main(String args[]){
		String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
		int diarias = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de diarias"));
		float valorDiaria = 80;
		float taxa;
		//5,50 > 15
		//6,00 = 16
		//8,00 < 15
		
		if(diarias > 15){
			taxa = 5.5f;
		}
		else if(diarias == 15){
			taxa = 6.0f;
		}
		else{
			taxa = 8.0f;
		}
		float totalTaxa    = taxa * diarias;
		float totalDiarias = valorDiaria * diarias;
		float totalGeral   = totalTaxa +  totalDiarias;
		System.out.println("Senhor(a) "+nomeCliente+" obrigado pela estadia em nosso hotel.");
		System.out.println("Segue o detalhamento de sua conta:");
		System.out.println("Valor Diarias.........: " + totalDiarias);
		System.out.println("Total Taxas...........: " + totalTaxa);
		System.out.println("Total Geral...........: " + totalGeral);
		System.out.println("");
		System.out.println("");
		System.out.println("Obrigado e volte sempre :)");
		
	}
}
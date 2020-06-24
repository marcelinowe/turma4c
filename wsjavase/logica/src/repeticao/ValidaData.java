import javax.swing.JOptionPane;
class ValidaData{
	public static void main(String args[]){
		int dia = 0;
		do{
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia"));
		}while(dia < 1 || dia > 31);
		System.out.println("Dia: " + dia);

		int mes = 0;
		do{
			mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mes"));
		}while(dia < 1 || dia > 12);
		System.out.println("Mes: " + mes);

		int ano = 0;
		do{
			ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano"));
		}while(dia < 1 || dia > 9999);
		System.out.println("Ano: " + ano);
	}
}
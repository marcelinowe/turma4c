import javax.swing.JOptionPane;
class DiasVida{
	public static void main(String args[]){
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu nascimento"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes do seu nascimento"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento"));

		int diaHoje = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de hoje"));
		int mesHoje = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de hoje"));
		int anoHoje = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de hoje"));

		int diffAno   = (anoHoje-1) - ano;
		int diffMeses = (diffAno * 12) + mesHoje;
		int diffDias  = (diffAno*365) + ((mesHoje-1)*30) + diaHoje;
		System.out.println("Anos....:"+diffAno);
		System.out.println("Meses...:"+diffMeses);
		System.out.println("Dias....:"+diffDias);
	}
}
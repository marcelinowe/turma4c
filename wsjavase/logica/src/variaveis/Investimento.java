import javax.swing.JOptionPane;
class Investimento{
	public static void main(String args[]){
		float capital  = Float.parseFloat(JOptionPane.showInputDialog("Digite o capital investido"));
		float taxa     = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de juros"));
		int meses       = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de meses"));
		float montante = capital * (float)Math.pow(1 + taxa/100,meses);
		System.out.println("Montante investido.....:"+montante);
	}
}
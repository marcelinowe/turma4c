package variaveis;
//Lista2_Exercicio4
import javax.swing.JOptionPane;
class OrdemDecrescente{
	public static void main(String args[]){
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro valor"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo valor"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o terceiro valor"));
		
		if(valor1 > valor2)
		{
			if(valor2 > valor3){
				System.out.println(valor1+" "+valor2+" "+valor3);
			}
			else{
				if (valor1 > valor3){
					System.out.println(valor1+" "+valor2+" "+valor3);
				}else{
					System.out.println(valor3+" "+valor1+" "+valor2);
				}
			}
		}
		else{
			if(valor2 > valor3){
				if(valor1 > valor3){
					System.out.println(valor2+" "+valor1+" "+valor3);
				}
				else{
					System.out.println(valor2+" "+valor3+" "+valor1);
				}
			}
			else{
				System.out.println(valor3+" "+valor2+" "+valor1);
			}
		}
	}
}
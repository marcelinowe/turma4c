//Lista1_Exercicio8
import javax.swing.JOptionPane;
class CaixaEletronico{
	public static void main(String args[]){
		int valorSaque = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do saque"));
		int resto = 0;
		int notas100;
		int notas50;
		int notas20;
		int notas10;
		int notas05;
		int notas02;
		int notas01;

		if(valorSaque > 0){
			notas100 = valorSaque/100;
			
			System.out.println("Valor do Saque..:" + valorSaque);

			if(notas100 > 0){
				System.out.println("Notas de 100....:" + notas100);
				resto = valorSaque % 100;
			}
			
			if(resto > 0){
				notas50 = resto/50;
				
				if(notas50 > 0){
					System.out.println("Notas de 50.....:" + notas50);
					resto = resto % 50;
				}
				
			}

			if(resto > 0){
				notas20 = resto/20;
		
				if(notas20 > 0){
					System.out.println("Notas de 20.....:" + notas20);
					resto = resto % 20;
				}
			}

			if(resto > 0){
				notas10 = resto/10;
				
				if(notas10 > 0){
					System.out.println("Notas de 10.....:" + notas10);
					resto = resto % 10;
				}				
			}

			if(resto > 0){
				notas05 = resto/5;
				if(notas05 > 0){
					System.out.println("Notas de 05.....:" + notas05);
					resto = resto % 5;
				}
			}

			if(resto > 0){
				notas02 = resto/2;
				if(notas02 > 0){
					System.out.println("Notas de 02.....:" + notas02);
					resto = resto % 2;
				}
			}

			if(resto > 0){
				notas01 = resto/1;

				if(notas01 > 0){
					System.out.println("Notas de 01.....:" + notas01);
					resto = resto % 1;
				}
			}
		}
	}
}
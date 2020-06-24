package br.com.veiculos.principal;

import javax.swing.JOptionPane;

import br.com.veiculos.modelo.Automovel;
import br.com.veiculos.modelo.Montadora;

public class TesteVeiculo {

	public static void main(String[] args) {
		Montadora montadora = new Montadora("GM", "c:\\GM", "EUA");
		
		Automovel carro = new Automovel(JOptionPane.showInputDialog("Digite a placa"),
				Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do IPVA")),
				Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Seguro")),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade atual")),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade do tanque")),
				montadora);
		
		if(JOptionPane.showConfirmDialog(null,"Deseja acelerar o carro?","Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0){
			do {
				if(JOptionPane.showConfirmDialog(null,"Acelerar com velocidade padr�o? 10km/h em 10km/h","Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0) {
					carro.acelerar();
				}
				else
				{
					carro.acelerar(Integer.parseInt(JOptionPane.showInputDialog("Digite o quanto deseja acelerar")));
				}
			}while(JOptionPane.showConfirmDialog(null,"Continuar acelerando o carro?","Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0);
		}

		if(JOptionPane.showConfirmDialog(null,"Deseja DESACELERAR carro?","Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0){
			do {
				carro.desacelerar(Integer.parseInt(JOptionPane.showInputDialog("Digite o quanto deseja DESACELERAR")));
			}while(JOptionPane.showConfirmDialog(null,"Continuar DESACELERANDO o carro?","Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == 0 && carro.getVelocidadeAtual() > 0);
		}
		System.out.println("Placa do carro.......................: "+carro.getPlaca().toUpperCase());
		System.out.println("Custo total to carro.................: "+carro.getTotal());
		System.out.println("Distancia que conseguira percorrer...: "+carro.getDistancia(Float.parseFloat(JOptionPane.showInputDialog("Digite a autonomia(km/l) do carro"))));
		
		if(carro.getStatus() == true) {
			System.out.println("O carro est� em movimento............? Sim - "+carro.getVelocidadeAtual()+" KM/H");
		}
		else{
			System.out.println("O carro est� em movimento............? N�o");
		}

	}

}

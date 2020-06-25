package br.com.collection.implementacao;

import java.util.HashMap;
import java.util.Map;

import br.com.collection.beans.Cargo;

public class TesteMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Cargo> lista = new HashMap<Integer,Cargo>();
		lista.put(1, new Cargo("DBA", 15000, "Senior"));
		lista.put(2, new Cargo("DEV", 5000, "Pleno"));
		lista.put(3, new Cargo("STG", 500, "Junior"));
		
		for (Cargo cargo : lista.values()) {
			System.out.println(cargo.getNome()+" - "+cargo.getSalario()+" - "+cargo.getNivel());
		}
	}

}

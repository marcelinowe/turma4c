package br.com.collection.implementacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import br.com.collection.beans.Cargo;

public class TesteLista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA",10000,"Pleno"));
		lista.add(new Cargo("ESTAG",1000,"Junior"));
		lista.add(new Cargo("ANALISTA",8000,"Senior"));
		Collections.sort(lista);
		
		for (Cargo cargo : lista) {
			System.out.println(cargo.getNome()+" - "+cargo.getSalario()+" - "+cargo.getNivel());
		}
	}

}

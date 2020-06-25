package br.com.collection.implementacao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lista = new ArrayList();
		lista.add("DBA");
		lista.add(15000);
		lista.add("Estag");
		lista.add(500);
		lista.add("CEO");
		lista.add(300000);
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		System.out.println(lista.get(0));
	}

}

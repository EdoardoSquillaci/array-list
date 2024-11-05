package org.array.list.ex;


//in questo esercizio stai creando un array list in cui sono presenti degli elementi. Nella prima parte
// è presente un ciclo while per che stai utilizzando per vedere in che posizione si trova l'elemento che cerchi dentro l'array.
//Hai un valore boolean che parte come false di default e stai indicando l'indice dell array con 0. Nel momento in cui
//cerchi il valore che preferisci il ciclo prende la posizione dalla grandezza della lista, e ritorna la posizione dell'elemento cercato in base a dove viene inserito nell'array


import java.util.ArrayList;

public class Main {

public static int indexofarraylist (ArrayList<String>list, String Element) {
	
	
	
	
	boolean isFound = false;
	
	int index = 0;
	
	while(!isFound && index < list.size()) {
	
	if(list.get(index).equals(Element)) 
		
		return index;
	    index ++;
	}
	
	return index;
	
}
	

	
  public static void main(String[]args)	{
	
	  ArrayList <String> strings = new ArrayList <String>();
	
	  strings.add("Geena");
	  strings.add("Giina");
	  strings.add("Goona");
	  strings.add("Guuna");
	  strings.add("Gaana");
	  System.out.println(strings);
	  System.out.println(Main.indexofarraylist(strings, "Guuna"));
}
	
	
}

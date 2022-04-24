package com.srl.pkg;

import java.util.ArrayList;
import java.util.List;

public class ListeSommet {
	private List<Sommet> listeSommet;

	public ListeSommet() {
		listeSommet = new ArrayList<Sommet>();
		//Entry
		listeSommet.add(new Sommet("E1",534,540));
		listeSommet.add(new Sommet("E2",405,538));
		listeSommet.add(new Sommet("E3",158,539));
		listeSommet.add(new Sommet("E4",6,473));
		listeSommet.add(new Sommet("E5",6,259));
		listeSommet.add(new Sommet("E6",6,97));
		listeSommet.add(new Sommet("E7",125,9));
		listeSommet.add(new Sommet("E8",318,9));
		listeSommet.add(new Sommet("E9",546,9));
		listeSommet.add(new Sommet("E10",715,97));
		listeSommet.add(new Sommet("E11",715,473));
		
		//Sommet 1 - 10
		listeSommet.add(new Sommet("S1",534,473));
		listeSommet.add(new Sommet("S2",405,473));
		listeSommet.add(new Sommet("S3",158,473));
		listeSommet.add(new Sommet("S4",57,473));
		listeSommet.add(new Sommet("S5",57,259));
		listeSommet.add(new Sommet("S6",125,259));
		listeSommet.add(new Sommet("S7",125,181));
		listeSommet.add(new Sommet("S8",284,181));
		listeSommet.add(new Sommet("S9",284,392));
		listeSommet.add(new Sommet("S10",125,392));
		
		//Sommet 11-20
		listeSommet.add(new Sommet("S11",405,392));
		listeSommet.add(new Sommet("S12",534,392));
		listeSommet.add(new Sommet("S13",654,392));
		listeSommet.add(new Sommet("S14",654,252));
		listeSommet.add(new Sommet("S15",534,252));
		listeSommet.add(new Sommet("S16",405,252));
		listeSommet.add(new Sommet("S17",654,97));
		listeSommet.add(new Sommet("S18",546,97));
		listeSommet.add(new Sommet("S19",405,97));
		listeSommet.add(new Sommet("S20",318,97));
		
		//Sommet 21
		listeSommet.add(new Sommet("S21",125,97));

	}
	
	public List<Sommet> getListeSommet() {
		return listeSommet;
	}
}

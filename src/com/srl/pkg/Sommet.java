package com.srl.pkg;

public class Sommet {
	private String Name;
	private int CoorX;
	private int CoorY;
	
	public Sommet(String name, int coorX, int coorY) {
		Name = name;
		CoorX = coorX;
		CoorY = coorY;
	}
	public String getName() {
		return Name;
	}
	public int getCoorX() {
		return CoorX;
	}
	public int getCoorY() {
		return CoorY;
	}

	
}

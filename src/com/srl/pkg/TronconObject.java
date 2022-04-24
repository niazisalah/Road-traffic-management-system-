package com.srl.pkg;
import java.awt.geom.Point2D;

public class TronconObject {
	private Point2D Point2D;
	private double Vitesse;
	
	public TronconObject(Point2D Point2D, double vitesse) {
		this.Point2D = Point2D;
		this.Vitesse = vitesse;
	}
	
	public Point2D getPoint2D() {
		return Point2D;
	}

	public double getVitesse() {
		return Vitesse;
	}
}

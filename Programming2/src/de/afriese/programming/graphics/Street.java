package de.afriese.programming.graphics;

import java.applet.Applet;
import java.awt.Graphics;

public class Street extends Applet {
	private House h1;
	private House h3;
	private House h5;

	public void init() {
		h1 = new House(70, 30, 100, 100);
		h3 = new House(60, 20, 180, 110);
		h5 = new House(50, 10, 250, 120);
	}

	public void paint(Graphics g) {
		h1.drawHouse(g);
		h1.outputWidth(g);
		h1.outputHeight(g);
		
		h3.drawHouse(g);
		h3.outputWidth(g);
		h3.outputHeight(g);
		
		h5.drawHouse(g);
		h5.outputWidth(g);
		h5.outputHeight(g);
	}
}

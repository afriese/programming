package de.afriese.programming.graphics;

import java.applet.Applet;
import java.awt.Graphics;

public class HouseSingle extends Applet {
	public void paint(Graphics g){
		g.drawRect(40, 40, 100, 50);
		g.drawLine(40, 40, 90, 20);
		g.drawLine(90, 20, 140, 40);
	}
}

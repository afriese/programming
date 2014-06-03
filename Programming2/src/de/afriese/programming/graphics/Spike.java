package de.afriese.programming.graphics;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Spike extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(5, 0, 20, 20);
		g.drawLine(0, 0, 30, 20);
		g.drawLine(0, 10, 30, 10);
		g.drawLine(0, 20, 30, 0);
		g.setColor(Color.BLACK);
		g.fillOval(9, 6, 4, 4);
		g.fillOval(17, 6, 4, 4);
		g.fillRect(11, 14, 8, 2);
	}
}

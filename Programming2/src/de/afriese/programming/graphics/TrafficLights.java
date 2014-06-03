package de.afriese.programming.graphics;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class TrafficLights extends Applet{
	public void paint(Graphics g){
		g.fillRect(20, 20, 70, 190);
		g.setColor(Color.RED);
		g.fillOval(30, 30, 50, 50);
		g.setColor(Color.ORANGE);
		g.fillOval(30, 90, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(30, 150, 50, 50);
	}
}

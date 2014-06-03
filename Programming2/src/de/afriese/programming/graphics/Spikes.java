package de.afriese.programming.graphics;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;

public class Spikes  {
	private int startX;
	private int startY;

	private Color bodyColor;
	private Color featuresColor;

	public Spikes(int startX, int startY, Color bodyColor, Color featuresColor)
			throws HeadlessException {
		super();
		this.startX = startX;
		this.startY = startY;
		this.bodyColor = bodyColor;
		this.featuresColor = featuresColor;
	}

	public void drawSpike(Graphics g) {
		g.setColor(bodyColor);
		g.fillOval(startX + 5, startY, 20, 20);
		g.drawLine(startX, startY, startX + 30, startY + 20);
		g.drawLine(startX, startY + 10, startX + 30, startY + 10);
		g.drawLine(startX, startY + 20, startX + 30, startY);

		g.setColor(featuresColor);
		g.fillOval(startX + 9, startY + 6, 4, 4);
		g.fillOval(startX + 17, startY + 6, 4, 4);
		g.fillRect(startX + 17, startY + 14, 8, 2);
	}
}

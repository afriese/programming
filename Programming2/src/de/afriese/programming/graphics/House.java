package de.afriese.programming.graphics;

import java.awt.*;

public class House {
	private int width;
	private int height;
	private int startX;
	private int startY;

	public House(int width, int height, int startX, int startY) {
		this.width = width;
		this.height = height;
		this.startX = startX;
		this.startY = startY;
	}

	public void drawHouse(Graphics g) {
		int roofX = startX + (int) (width / 2);
		int roofY = startY - (int) (height / 2);
		g.drawRect(startX, startY, width, height);
		g.drawLine(startX, startY, roofX, roofY);
		g.drawLine(roofX, roofY, startX + width, startY);
	}

	public void outputWidth(Graphics g) {
		g.drawString("Width: " + width, startX, startY + height + 15);
	}

	public void outputHeight(Graphics g) {
		g.drawString("Height: " + height, startX, startY + height + 30);
	}
}

package de.afriese.programming.graphics;

import java.awt.Graphics;

public class Person {
	private int baseX;
	private int baseY;
	private int height;

	public Person(int baseX, int baseY, int height) {
		super();
		this.baseX = baseX;
		this.baseY = baseY;
		this.height = height;
	}

	public void drawPerson(Graphics g) {
		int sect = (int) (height / 5.0);
		g.drawLine(baseX, baseY - 2 * sect, baseX, baseY - 4 * sect);
		g.drawLine(baseX - sect, baseY, baseX, baseY - 2 * sect);
		g.drawLine(baseX + sect, baseY, baseX, baseY - 2 * sect);
		g.drawLine(baseX - sect, baseY - 3, baseX - sect, baseY - 3 * sect);
		g.drawOval(baseX - (int) (sect / 2.0), baseY - height, sect, sect);
	}
}

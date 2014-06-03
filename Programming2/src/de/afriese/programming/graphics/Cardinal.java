package de.afriese.programming.graphics;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Label;

public class Cardinal extends Applet{
	private Label first;
	private Label second;
	private Label thrid;

	public void init() {
		first = new Label("Frist");
		second = new Label("Second", Label.CENTER);
		thrid = new Label("Thrid", Label.RIGHT);

		first.setBackground(Color.RED);
		second.setBackground(Color.BLUE);
		second.setForeground(Color.YELLOW);
		thrid.setBackground(Color.GREEN);

		add(first);
		add(second);
		add(thrid);
	}

}

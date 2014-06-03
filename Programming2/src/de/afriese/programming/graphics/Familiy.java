package de.afriese.programming.graphics;

import java.applet.Applet;
import java.awt.Graphics;

public class Familiy extends Applet {
	private Person dad;
	private Person mum;
	private Person son;
	private Person daughter;
	
	public void init(){
		dad = new Person(100, 100, 80);
		mum = new Person(150,100,80);
		son = new Person(200, 100, 40);
		daughter = new Person(250, 100, 40);
	}
	
	public void paint(Graphics g){
		dad.drawPerson(g);
		mum.drawPerson(g);
		son.drawPerson(g);
		daughter.drawPerson(g);
	}
}

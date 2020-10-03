package model;

import processing.core.PApplet;

public class Screen extends Story{
	private PApplet app;
	
	//I want to use switch :3
	public Screen(int px,int py,PApplet app) {
		super(px,py);
		this.app=app;
	}
}

//in this class only write code :3
//the image is in---> view

// use for move the screen (the image of the page back)
//super.moveParallaxx();	
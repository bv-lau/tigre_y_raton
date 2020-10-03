package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{
	
	PImage parallax,logo,next,rat,tiger,strokes,donut,flower,knife,save,share_donut,yes_tks,donut_rat,donut_tiger,want_flower,alert_save,its_save;

	int movParallax;
	String[] text;
	
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(700,700);
	}
	
	public void setup() {
		text = loadStrings("../data/Tigre_y_Raton.txt");

		//PARALLAX EFFECT (each screen):
		parallax = loadImage("../data/PARALLAX.png");

		//In first screen:
		logo = loadImage("../data/LOGO.png"); //LOGO
		next = loadImage("../data/NEXT.png"); //Button (next or play)

		//In second screen:
		rat = loadImage("../data/RAT.png"); // Draw: Rat
		tiger = loadImage("../data/TIGER.png"); // Draw: Tiger

		strokes = loadImage("../data/STROKES.png"); //strokes in colors

		donut = loadImage("../data/DONUT.png"); // Draw: Donut / Bizcocho
		flower = loadImage("../data/FLOWER.png"); // Draw: flower
		knife = loadImage("../data/KNIFE.png"); // Draw: knife
		  
		save = loadImage("../data/SAVE.png"); // Button: save (new story)

		share_donut = loadImage("../data/SHARE-DONUT.png"); // message: Tiger says share donut
		  
		yes_tks = loadImage("../data/YES-TKS.png"); // message: Rat says yes

		donut_rat = loadImage("../data/DONUT-RAT.png"); // Draw: Donut / Bizcocho of Rat (left)
		donut_tiger = loadImage("../data/DONUT-TIGER.png"); // Draw: Donut / Bizcocho of Tiger (right)
		  
		want_flower = loadImage("../data/WANT-FLOWER.png"); // message: Tiger says want flower

		alert_save = loadImage("../data/ALERT-SAVE.png"); //alert (you can use the save button)
		its_save = loadImage("../data/ITS-SAVE.png"); // message: its save

		//values for move ->parallax :3
		movParallax = 200;
	}
	
	public void draw() {
		//background(255);
		
		//images:
		imageMode (CENTER);
		image(parallax,width/2,height/2);
	}

}

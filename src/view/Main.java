package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{
	
	PImage parallax,logo,next,rat,tiger,strokes,donut,flower,knife,save,share_donut,yes_tks,donut_rat,donut_tiger,want_flower,alert_save,its_save;

	int posXparallax;
	int posYparallax;
	
	int pantalla;
	
	int posXpara;
	int posYpara;
	
	int position;
	
	int velocity;
	
	int movParallax;
	String[] text;
	String[] arrayTextWords;
	//char[] arrayWord = {'tigre', 'compartieramos', 'raton', 'flor', 'bizcocho'};
	
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(700,700);
	}
	
	public void setup() {
		
		pantalla=0;
		
		//screen un center
		posXparallax = width/2;
		posYparallax = height/2;
		//width/2,height/2
		
		posXpara =250;
		posYpara =250;
		
		
		velocity=6;
		
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
		
		/*
		for (int i = 0; i < text.length; i++) {
		    int arraySplit = text[i].split();
		    for (int j = 0; j < arraySplit.length; j++) {
		      arrayTextWords.push(arraySplit[j]);
		    }
		  } */
	}
	
	public void draw() {
		background(255);
		
		//images:
		imageMode (CENTER);
		//width/2,height/2
		image(parallax,posXparallax, posYparallax);
		//parallax_screen._paint();
		
		switch(pantalla){
		case 0:
			imageMode (CENTER);
			image(logo,width/2,height/2);
			image(next,622,622);
			break;
		case 1:
			imageMode (CENTER);
			image(tiger,width/2,height/2);
			image(rat,width/2,height/2);
			image(strokes,width/2,height/2);
			image(knife,70,360);
			image(donut,70,484);
			image(flower,70,610);
			image(save,634,638);
			break;
		case 2:
			rectMode (CENTER);
			ellipse(width/2, width/2, 50, 50);
			break;
		case 3:
			imageMode (CENTER);
			image(alert_save,(width/2)-20,height/2);
			break;
			
			default:
			break;
	}
		fill(0);
		text(mouseX+","+mouseY,mouseX,mouseY);	
	}
	
	/*public void moveParallaxxx(){
		if(posXpara<250){
		if(dist(posXpara,posYpara,mouseX,mouseY)<25){
			posXparallax=posYparallax+velocity;
			if(posXparallax>410 || posYparallax<40){
				velocity=velocity*-1;
			}
		
			
		}
		} else { 
			if(dist(posXpara,posYpara,mouseX,mouseY)<25){
				posXparallax=posXparallax+velocity;
			if(posXparallax>410 || posXparallax<40){
				velocity=velocity*-1;
				}
		
			
			}
		}
	}*/
	
	public void mouseReleased() {
		switch(pantalla){
		case 0:
			if (mouseX > 586 && mouseX < 657 && mouseY > 586 && mouseY < 657) {
				pantalla = 1;
			} 
			break;
		case 1:
			if (mouseX > 586 && mouseX < 657 && mouseY > 586 && mouseY < 657) {
				pantalla = 2;
			} 
			break;
		case 2:
			if (mouseX > 586 && mouseX < 657 && mouseY > 586 && mouseY < 657) {
				pantalla = 3;
			} 
			break;
			
			default:
			break;
	}
	}
	
	
	public void mouseMoved() {
		/*if (dist(posXparallax, posYparallax, mouseX, mouseY) < 700) {
			posXparallax = mouseX;//dragged image
			posYparallax = mouseY;
		}*/
		if(mouseX<374&& mouseX>329){if (dist(posXparallax, posYparallax, mouseX, mouseY) < 100){
			posXparallax = mouseX;
		}else {
			posXparallax = width/2;
		}}
			switch(pantalla){
			case 0:
				if (mouseX > 586 && mouseX < 657 && mouseY > 586 && mouseY < 657) {
					image(next,622,622,300,300);
				} 
				break;
			case 1:
				
				break;
			case 2:
				 
				break;
				
				default:
				break;
		}
			
		
		/*if (dist(posXparallax, posYparallax, mouseX, mouseY) < 50) {
			posXparallax = mouseX;
			posYparallax = mouseX;

		}*/
		
	}
}

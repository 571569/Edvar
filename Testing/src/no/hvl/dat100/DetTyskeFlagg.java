package no.hvl.dat100;


import easygraphics.EasyGraphics;

public class DetTyskeFlagg extends EasyGraphics {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		makeWindow("Det tyske flagget");
		 
	    setColor(0, 0, 0);
	    fillRectangle(50, 50, 200, 50);
	    setColor(255, 0, 0);
	    fillRectangle(50, 100, 200, 50);
	    setColor(255, 255, 0);
	    fillRectangle(50, 150, 200, 50);
	    
	    
	}
}
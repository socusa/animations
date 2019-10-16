package animations;

import java.awt.Graphics;

public class Shape {
	private int startx;
	private int starty;
	private boolean leftArmUp;
	private boolean rightArmUp;
	private boolean leftLegUp;
	private boolean rightLegUp;
	
	public Shape(int startx,
			     int starty) {
		this.startx = startx;
		this.starty = starty;
	}
	
	public void changeLeftArm() {
		leftArmUp = !leftArmUp;
	}
	
	public void changeRightArm() {
		rightArmUp = !rightArmUp;
	}
	
	public void changeLeftLeg() {
		leftLegUp = !leftLegUp;
	}
	
	public void changeRightLeg() {
		rightLegUp = !rightLegUp;
	}

	public void drawHeadAndBody(Graphics g) {
		g.drawOval(startx - 50,starty,100,100);
		
		g.drawLine(startx,starty + 100,startx,starty + 200);
	}
	
	public void drawLeftArm(Graphics g) {
		if (leftArmUp)
   		   g.drawLine(startx, starty + 140, startx - 50, starty + 130);
		else
		   g.drawLine(startx, starty + 140, startx -50, starty + 150 );
	}

	public void drawRightArm(Graphics g) {
		if (rightArmUp)
   		   g.drawLine(startx, starty + 140, startx + 50, starty + 130);
		else
		   g.drawLine(startx, starty + 140, startx + 50, starty + 150 );
	}

	public void drawLeftLeg(Graphics g) {
		if (leftLegUp)
   		   g.drawLine(startx, starty + 200, startx - 50, starty + 190);
		else
		   g.drawLine(startx, starty + 200, startx -50, starty + 210 );
	}

	public void drawRightLeg(Graphics g) {
		if (rightLegUp)
   		   g.drawLine(startx, starty + 200, startx + 50, starty + 190);
		else
		   g.drawLine(startx, starty + 200, startx + 50, starty + 210 );
	}
	
	public void draw(Graphics g) {
		drawHeadAndBody(g);
		
		drawLeftArm(g);
		
		drawRightArm(g);
		
		drawLeftLeg(g);
		
		drawRightLeg(g);
	}
	
	

}

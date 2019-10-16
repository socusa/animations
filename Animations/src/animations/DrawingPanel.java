package animations;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

import static animations.MyFrame.*;

public class DrawingPanel extends JPanel {
	Shape shape;
	int width;
	int height;
	protected String message;
	protected int startx;
	protected int starty;
	
	public DrawingPanel(int width,
			            int height) {
		setPreferredSize(new Dimension(width,height));
		
		shape = new Shape(width/2,40);
		
		this.width = width;
		this.height = height;
		
		startx = width/2;
		starty = height/2;
		
		message = "Test";
	}
	
	public int width() {
		return(width);
	}
	
	public int height() {
		return(height);
	}
	
	public Shape getShape() {
		return(shape);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.black);
		
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.white);
		
		if (MyFrame.shape.isSelected())
		   shape.draw(g);
		else if (MyFrame.words.isSelected()) {
	       g.setColor(Color.white);		
	
		   g.drawString(message,startx,this.height/2);
		}
	}
}

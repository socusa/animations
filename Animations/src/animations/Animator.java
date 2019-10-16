package animations;

import java.awt.Graphics;

public class Animator implements Runnable {
	protected boolean keepGoing;
	protected Thread thread;
	protected DrawingPanel drawingPanel;
	
	public Animator(DrawingPanel drawingPanel){
		this.drawingPanel = drawingPanel;
	}
	
	protected void start() {
		keepGoing = true;
		
		thread = new Thread(this);
		
		thread.start();
	}
	
	protected void pause(int milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException ie) {
			System.out.println(ie);
		}
	}
	
	protected void draw() {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (keepGoing) {
			pause(Integer.parseInt(MyFrame.delay.getText()));
			
			draw();
		}

	}

}

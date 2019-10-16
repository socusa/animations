package animations;

public class Line {
	protected int startx;
	protected int starty;
	protected int endx;
	protected int endy;
	
	public Line(int startx,
			    int starty,
			    int endx,
			    int endy) {
		this.startx = startx;
		this.starty = starty;
		this.endx = endx;
		this.endy = endy;
	}
	
	void setStartX(int startx) {
		this.startx = startx;
	}
	
	void setStartY(int starty) {
		this.starty = starty;
	}
	
	void setEndX(int endx) {
		this.endx = endx;
	}
	
	void setEndY(int endy) {
		this.endy = endy;
	}
}

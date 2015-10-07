package shapes;
import java.awt.Color;
import java.awt.geom.Rectangle2D;	
import java.awt.Graphics2D;
import java.awt.Point;

// Class cRect for drawing Rects is derived
// from our 'base class' cShape

public class MyRect extends Rectangle2D.Double implements AbstractShape{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8531696133543935232L;

/*	private Point ptStart; // Start point of shape

	private Point ptEnd; // End point of shape

	private int nwidth; // Width of shape

	private int nheight; // Height of shape
*/
	public void setStart(Point pt) {
		setRect(pt.getX(), pt.getY(), 0, 0);
				
	}

	public void setEnd(Point pt) {
		
		Point start = new Point((int)getX(), (int)getY());
		setFrameFromDiagonal(start, pt);
		//ptEnd = pt;
	}

	public void setWidth(double w) {
		width = w;
	}

	public void setHeight(double h) {
		height = h;
	}

	public Point getStart() {
		Point start = new Point((int)getX(), (int)getY());
		return start;
	}

	public Point getEnd() {
		return new Point(0, 0);
	}
	
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	// Drawing routine
	@Override
	public void Draw(Graphics2D g) {
		g.setColor(Color.blue.brighter()); // Set default color
		g.draw(this);
	}

}

// Class cRect ends

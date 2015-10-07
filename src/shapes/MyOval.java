package shapes;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;


/**
 *  Class MyOval for drawing ovals is derived
 *  from our 'base class' AbstratShape
 */
public class MyOval extends Ellipse2D.Double implements AbstractShape {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 744275142022471773L;

/*	private Point ptStart; // Start point of shape

	private Point ptEnd; // End point of shape

	private int nwidth; // Width of shape

	private int nheight; // Height of shape
*/
	public void setStart(Point pt) {
		setFrame(pt.getX(), pt.getY(), 0,0);
	}

	public void setEnd(Point pt) {
		Point start = new Point((int)getX(), (int)getY());
		setFrameFromDiagonal(start, pt);
	}

	public void setWidth(int w) {
		width = w;
	}

	public void setHeight(int h) {
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
	public void Draw(Graphics2D g) {
		g.setColor(Color.green.darker()); // Set default color
		g.draw(this);
	}

}

// Class cOval ends

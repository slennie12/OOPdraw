package shapes;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

/**
 *  Class MyLine for drawing lines is
 *  derived from our 'base' class AbstractShape
 */
public class MyLine extends Line2D.Double implements AbstractShape {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3961169099887011500L;
	//private Color clrFront; // Default color
	
	@Override
	public void setStart(Point pt) {
		setLine(pt.getX(), pt.getY(), 0,0);
	}

	@Override
	public void setEnd(Point pt) {
		setLine(getX1(), getY1(), pt.getX(), pt.getY());
	}

	@Override
	public Point getStart() {
		Point start = new Point((int)getX1(), (int)getY1());
		return start;
		
	}

	@Override
	public Point getEnd() {
		Point end = new Point((int)getX2(), (int)getY2());
		return end;
	}

	// Drawing routine
	public void Draw(Graphics2D g) {
		g.setColor(Color.red); // Set default color -you may ignore colors
		g.draw(this);
	}
}

// Class cLine ends

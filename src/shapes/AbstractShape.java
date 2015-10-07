package shapes;
//import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * base class AbstractShape
 *
 */
public interface AbstractShape

{

/*	// Data members
	protected Point ptStart; // Start point of shape

	protected Point ptEnd; // End point of shape

	protected int nwidth; // Width of shape

	protected int nheight; // Height of shape

	protected Color clrFront; // Default color

	public AbstractShape() {
		// default color is red, try your combinations
		clrFront = Color.red;
	}*/

	public abstract void setStart(Point pt);

	public abstract void setEnd(Point pt);

	public Point getStart();

	public Point getEnd();

	public abstract void Draw(Graphics2D g);

}

// Base class cShape ends

package composers;

import java.awt.Point;

import shapes.AbstractShape;
import shapes.MyOval;

public class OvalComposer implements ShapeComposer{
	private MyOval o;

	@Override
	public void create(int x, int y) {
		o = new MyOval(); // Create the shape - Oval
		o.setStart(new Point(x, y));// Set the start position where mouse went down
	}

	@Override
	public void expand(int x, int y) {
		Point startPos = o.getStart();
		Point drawto = new Point(Math.max(x, startPos.x), Math.max(y, startPos.y));
		Point newstart = new Point(Math.min(x, startPos.x), Math.min(y, startPos.y));
		int newWidth = Math.abs((drawto.x - newstart.x));
		int newHeight = Math.abs((drawto.y - newstart.y));
	
		o.setWidth(newWidth);
		o.setHeight(newHeight);
		o.setStart(newstart);
		o.setEnd(new Point(x,y));
	}

	@Override
	public void complete(int x, int y) {
		expand(x,y);
	}
	
	@Override
	public AbstractShape getShape(){
		return o;
	}

}

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
		Point drawto = new Point(Math.max(x, o.getStart().x), Math.max(y, o.getStart().y));
		Point newstart = new Point(Math.min(x, o.getStart().x), Math.min(y, o.getStart().y));
		int nwidth1 = Math.abs((drawto.x - newstart.x));
		int nheight1 = Math.abs((drawto.y - newstart.y));
		//o = (MyOval) vt.get(i);
		o.setWidth(nwidth1);
		o.setHeight(nheight1);
		o.setStart(newstart);
		
		
	}

	@Override
	public void complete(int x, int y) {
		Point drawto = new Point(Math.max(x, o.getStart().x), Math.max(y, o.getStart().y));
		Point newstart = new Point(Math.min(x, o.getStart().x), Math.min(y, o.getStart().y));
		int nwidth1 = Math.abs((drawto.x - newstart.x));
		int nheight1 = Math.abs((drawto.y - newstart.y));
		//o = (MyOval) vt.get(i);
		o.setWidth(nwidth1);
		o.setHeight(nheight1);
		o.setStart(newstart);
		
	}
	
	@Override
	public AbstractShape getShape(){
		return o;
	}

}

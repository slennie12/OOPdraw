package composers;

import java.awt.Point;

import shapes.AbstractShape;
import shapes.MyRect;

public class RectComposer implements ShapeComposer{
	
	private MyRect r;

	@Override
	public void create(int x, int y) {
		r = new MyRect();
		r.setStart(new Point(x, y));
		
	}

	@Override
	public void expand(int x, int y) {
		//Point drawto = new Point(Math.max(x, r.getStart().x), Math.max(y, r.getStart().y));
		Point newstart = new Point(Math.min(x, (int)r.getX()), Math.min(y, (int)r.getY()));
		//int nwidth1 = Math.abs((newstart.x - drawto.x));
		//int nheight1 = Math.abs((drawto.y - newstart.y));
		//o = (MyOval) vt.get(i);
/*		r.setWidth(nwidth1);
		r.setHeight(nheight1);
		r.setStart(newstart);*/
		
		r.setStart(newstart);
		r.setEnd(new Point(x,y));
		
	}

	@Override
	public void complete(int x, int y) {
/*		Point drawto = new Point(Math.max(x, r.getStart().x), Math.max(y, r.getStart().y));
		Point newstart = new Point(Math.min(x, r.getStart().x), Math.min(y, r.getStart().y));
		int nwidth1 = Math.abs((drawto.x - newstart.x));
		int nheight1 = Math.abs((drawto.y - newstart.y));
		//o = (MyOval) vt.get(i);
		r.setWidth(nwidth1);
		r.setHeight(nheight1);
		r.setStart(newstart);*/
		
		expand(x,y);
		
	}
	
	@Override
	public AbstractShape getShape(){
		return r;
		
	}

}

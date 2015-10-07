package composers;

import java.awt.Point;

import shapes.AbstractShape;
import shapes.MyLine;

//hoi

public class LineComposer implements ShapeComposer {
	

	private MyLine l;

	@Override
	public void create(int x, int y) {
		l = new MyLine();
		l.setStart(new Point(x,y));
		
	}

	@Override
	public void expand(int x, int y) {
		l.setEnd(new Point(x,y));		
	}

	@Override
	public void complete(int x, int y) {
		expand(x,y);
	}
	
	@Override
	public AbstractShape getShape(){
		return l;
	}
}

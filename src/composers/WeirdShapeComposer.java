package composers;

import java.awt.Point;

import shapes.AbstractShape;
import shapes.WeirdShape;

public class WeirdShapeComposer implements ShapeComposer {
	private WeirdShape weird;
	
	public WeirdShapeComposer(){
		weird = new WeirdShape();
	}

	@Override
	public void create(int x, int y) {
		weird.setStart(new Point(x,y));
		
	}

	@Override
	public void expand(int x, int y) {
		weird.setEnd(new Point(x,y));
		
	}

	@Override
	public void complete(int x, int y) {
		expand(x,y);
		
	}

	@Override
	public AbstractShape getShape() {
		return weird;
	}

}

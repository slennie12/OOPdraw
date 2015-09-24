package composers;

import shapes.AbstractShape;

public interface ShapeComposer {
	
	public void create(int x, int y);
	public void expand(int x, int y);
	public void complete(int x, int y);
	public AbstractShape getShape();
}

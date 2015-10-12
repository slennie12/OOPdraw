package shapes;

import java.awt.Graphics2D;
import java.awt.Point;

public class WeirdShape implements AbstractShape{
	
	private MyLine line;
	private MyOval oval;
	private MyRect rect;
	
	public WeirdShape(){
		line = new MyLine();
		oval = new MyOval();
		rect = new MyRect();
	}

	@Override
	public void setStart(Point pt) {
		line.setStart(pt);
		oval.setStart(pt);
		rect.setStart(pt);
		
	}

	@Override
	public void setEnd(Point pt) {
		line.setEnd(pt);
		oval.setEnd(pt);
		rect.setEnd(pt);		
	}

	@Override
	public Point getStart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getEnd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Draw(Graphics2D g) {
		line.Draw(g);
		oval.Draw(g);
		rect.Draw(g);
		
	}
	
}

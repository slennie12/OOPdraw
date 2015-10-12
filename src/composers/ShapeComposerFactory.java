package composers;

public class ShapeComposerFactory {
	private String[] names;
	private static ShapeComposerFactory _instance = null;
	
	public ShapeComposerFactory(){		
		names = new String[4];
		names[0] = "Rectangle";
		names[1] = "Oval";
		names[2] = "Line";
		names[3] = "Weird Shape";
	}
	
	private static void createInstance(){
		if(_instance == null){
			_instance = new ShapeComposerFactory();
		}
	}
	
	public static ShapeComposerFactory getInstance(){
		if(_instance == null){
			createInstance();
		}
		return _instance;
	}
	
	public ShapeComposer createComposer(String name){
		ShapeComposer composer = null;
		switch(name){
		case "Rectangle" : composer = new RectComposer();
		break;
		case "Oval" : composer = new OvalComposer();
		break;
		case "Line" : composer = new LineComposer();
		break;
		case "Weird Shape" : composer = new WeirdShapeComposer();
		break;
		default: composer = new RectComposer();
		}
		
		return composer;
	}
	
	
	public String[] listComposerNames(){
		return names;
	}

}

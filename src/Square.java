
public class Square extends Shape {
	
	public Square(Colorable color) {
		super(color);
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Square drawn. " + color.fill();
	}

}

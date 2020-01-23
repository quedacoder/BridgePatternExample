
public abstract class Shape {
	
	protected Colorable color;
	
	public Shape(Colorable color) {
		this.color = color;
	}

	abstract public String draw();

}


public abstract class Shape {
	
	public int width;
	public int height;
	
	public Shape(int width , int height) {
		this.width = width;
		this.height = height;
	}
	abstract int area();

}

class Triangle extends Shape{
	public Triangle(int width , int height) {
		super(width , height);
	}
	public int area() {
		return width * height / 2 ; 
	}
}

class Rectangle extends Shape{
	public Rectangle(int width , int height) {
		super(width , height);
	}
	public int area() {
		return width * height;
	}
}

class Circle extends Shape{
	
	public Circle(int radius1 , int radius2) {
		super(radius1 , radius2);
	}
	public int area() {
		return (int)(width * 2 * 3.14);
	}
	
}

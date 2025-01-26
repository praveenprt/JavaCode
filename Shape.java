 abstract class Shape {

	abstract public double calculateArea();

}

class Circle extends Shape {
	
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		
		return 3.14*radius*radius ;
	} 
}


class Rectangle extends Shape {

private double width;
private double 	height;



public Rectangle(double width, double height) {
	super();
	this.width = width;
	this.height = height;
}


@Override
public double calculateArea() {
	return width * height;
}

}

public class Main {
public static void main(String [] args) {
	
	Circle c1 = new Circle(5);
	System.out.println("Circle radius " + 	c1.calculateArea());
	Rectangle r1 = new Rectangle(5,15);
	System.out.println("Rectangle area " + 	r1.calculateArea());

	
}
}


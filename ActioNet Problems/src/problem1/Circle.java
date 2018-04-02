package problem1;

public class Circle implements Shape {

	private double area;
	private double perimeter;
	private double radius;
	
	Circle(double radius)
	{
		this.radius=radius;
		
	}
	
	private void calcArea()
	{
		area = Math.PI*radius*radius;
		return;
	}
	private void calcPerimeter()
	{
		perimeter= 2 * Math.PI * radius;
		return;
	}
	
	@Override
	public double getArea() {
		calcArea();
		return area;
	}

	@Override
	public double getPerimeter() {
		calcPerimeter();
		return perimeter;
	}

}

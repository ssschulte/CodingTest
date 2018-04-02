package problem1;

public class Square implements Shape {
	
	private double area;
	private double perimeter;
	private double side;
	
	Square(double side)
	{
		this.side=side;
		
	}
	
	private void calcArea()
	{
		area = side * side;
		return;
	}
	private void calcPerimeter()
	{
		perimeter= 4 * side;
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

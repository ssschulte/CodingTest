package problem1;

public class Rectangle implements Shape {

	private double area;
	private double perimeter;
	private double height;
	private double width;
	
	Rectangle(double height, double width)
	{
		this.height=height;
		this.width=width;
		
	}
	
	private void calcArea()
	{
		area = height * width;
		return;
	}
	private void calcPerimeter()
	{
		perimeter= 2*height + 2*width;
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

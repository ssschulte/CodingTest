package problem1;

public class Triangle implements Shape {

	private double area;
	private double perimeter;
	private double side1;
	private double side2;
	private double side3;

Triangle(double s1, double s2, double s3)
{
	this.side1=s1;
	this.side2=s2;
	this.side3=s3;
	
}
private void calcArea()
{
	double p = (side1 + side2 +side3)/2.0;
	area = Math.sqrt((p)*(p-side1)*(p-side2)*(p-side3));
	return;
}
private void calcPerimeter()
{
	perimeter= side1 + side2 + side3;
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

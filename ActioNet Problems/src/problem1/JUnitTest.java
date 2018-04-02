package problem1;

import org.junit.Test;

//Is it better to write all test cases in one class or have a small test class per class written?

public class JUnitTest {
		  @Test
		  public void evaluatesExpression() {
		    Circle circle = new Circle(2.0);
		    Rectangle rect = new Rectangle(2.0, 3.0);
		    Square sq = new Square(4.0);
		    Triangle tri = new Triangle (3.3,4.4,5.5);
		    
		    circle.getArea();
		    circle.getPerimeter();
		    rect.getArea();
		    rect.getPerimeter();
		    sq.getArea();
		    sq.getPerimeter();
		    tri.getArea();
		    tri.getPerimeter();
		
		  }
		}


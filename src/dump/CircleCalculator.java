package dump;

public class CircleCalculator extends CalculatorWindow implements AreaCalculator{
	private double radius;
	private static final double PI = 3.143;
	public CircleCalculator() {
		super();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculateCircle(double radius) {
		double area = PI*radius*radius;
		System.out.println("Area of circle:::"+area);
	}

	@Override
	public void calculateSquare(int side) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateRectangle(int length, int width) {
		// TODO Auto-generated method stub
		
	}

}

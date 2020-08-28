package oopsConcepts;

public class CalculateShapeCircle implements CalculateAreaOfShapes,Calculater{

	@Override
	public double calculateCircleArea(double radius) {
		// TODO Auto-generated method stub
		return (3.143*radius*radius);
	}

	@Override
	public double calculateSquareArea(double side) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void openWindow() {
		System.out.println("Open Circle Window");
		
	}

}

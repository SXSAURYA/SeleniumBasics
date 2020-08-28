package oopsConcepts;

public class CalculateShapeSquare implements CalculateAreaOfShapes,Calculater{

	@Override
	public double calculateCircleArea(double radius) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateSquareArea(double side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public void openWindow() {
		System.out.println("Open Circle Window");
		
	}

}

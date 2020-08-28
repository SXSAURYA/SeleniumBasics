package oopsConcepts;

public class OOPSHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW bmwCar = new BMW();
		bmwCar.accelerateCar();
		bmwCar.numberOfGears();
		bmwCar.numberOfWindows(3);
		bmwCar.stopCar();
		
		CalculateAreaOfShapes cs = new CalculateShapeCircle();
		System.out.println(cs.calculateCircleArea(4));
		cs.openWindow();
	}

}

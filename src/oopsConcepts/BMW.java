package oopsConcepts;

public class BMW extends Car {

	//Parent Class, Super Class, base class
	public void numberOfGears() {
		System.out.println("4 gears");
	}

	// What is polymorphism and type of polymorphism
	public void accelerateCar() {
		super.accelerateCar();
		System.out.println("Accelerate with 180 miles/hours");
	}

	public void numberOfWindows(int windows) {
		System.out.println("Number of windows::" + windows);
	}
}

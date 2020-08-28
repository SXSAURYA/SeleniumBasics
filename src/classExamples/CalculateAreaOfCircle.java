package classExamples;

public class CalculateAreaOfCircle {
	 protected double radius;
	private double side;
	private double length;
	private double width;
	private double area;
	
	public void calculateAreaOfCircle(double radius) {
		area = 3.14*radius*radius;
		System.out.println("area of circle::;"+area);
	}

}

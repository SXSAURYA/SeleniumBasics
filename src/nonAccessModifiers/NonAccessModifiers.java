package nonAccessModifiers;

public class NonAccessModifiers {

	static {
		System.out.println("This will be executing first");
	}
	public NonAccessModifiers() {
		System.out.println("In Constructor");
	}
	
	public static final double PI = 3.143;
	public volatile int volatieVarible = 30;
	
	public static void calculateArea(double radius) {
		System.out.println("Area"+(PI*radius*radius));
	}
	
	public static final void calculate(double radius) {
		System.out.println("Area"+(PI*radius*radius));
	} 
}

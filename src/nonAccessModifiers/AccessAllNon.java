package nonAccessModifiers;

public class AccessAllNon {

	public static void main(String[] args) {
		//Static block will be going to be call before Constructor calling
		NonAccessModifiers na = new NonAccessModifiers();
		System.out.println(NonAccessModifiers.PI);
		NonAccessModifiers.calculateArea(3);
	}

}

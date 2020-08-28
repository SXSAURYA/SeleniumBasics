package dump;

public abstract class Car {
	
	public void accelerateCar() {
		System.out.println(">>>>>> accelaerate Car>>>>>>>>>>");
	}
	
	public void applyBrakes() {
		System.out.println(">>>>>> apply Brakes>>>>>>");
	}
	
	public void chageGears() {
		System.out.println("Changing car for "+this.getClass().getSimpleName());
	}

}

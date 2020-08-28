package dump3;

public class NewException extends Exception{

	Object var;
	public NewException(Object var) {
		this.var = var;
	}
	
	public String toString() {
		return "I will return a new Exception "+var;
	}
}

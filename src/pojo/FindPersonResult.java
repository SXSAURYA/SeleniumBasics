package pojo;

public class FindPersonResult {

	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public Home getHome() {
		return home;
	}
	public void setHome(Home home) {
		this.home = home;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
	public FavoriteColors getFavoriteColors() {
		return favoriteColors;
	}
	public void setFavoriteColors(FavoriteColors favoriteColors) {
		this.favoriteColors = favoriteColors;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	private String SSN;
	private String DOB;
	private Home home;
	private Office office;
	private FavoriteColors favoriteColors;
	private int Age;
}


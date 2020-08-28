package dump;

public class Conditions {

	public void validateMaximize() {
		if (2 > 3) {
			System.out.println("2 is greater than 3");
		} else if (3 >= 4) {

		} else if (2>1 && 2<3) {
			System.out.println(2);
		}else if (2>1 || 2<1) {
			System.out.println();
		}else if (3!=2) {
			System.out.println(3);
		}else {
			System.out.println("2 is smaller than 3");
		}
	}

	public void getDriver(String browser) {
		switch (browser.toLowerCase()) {
		case "chromer":
			break;
		case "firefox":

			break;

		default:
			break;
		}
	}
}

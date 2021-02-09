package check;

import constants.Constants;

public class Check {

	private static String lastName = "福地";
	private static String firstName = "和樹";

	public static void main(String[] args) {
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		printName(lastName, firstName);
		pet.introduce();
		robotPet.introduce();
	}

	private static void printName(String ln, String fn) {
		System.out.println("printNameメソッド → " + ln + fn);
	}
}

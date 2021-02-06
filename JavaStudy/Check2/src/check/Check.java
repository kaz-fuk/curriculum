package check;

import constants.Constants;

public class Check {

  private static String firstName = "福地";
  private static String lastName = "和樹";

  public static void main(String[] args) {
    Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
    RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
    printName();
    pet.introduce();
    robotPet.introduce();
  }

  private static void printName() {
    System.out.println("printNameメソッド → " + firstName + lastName);
  }
}

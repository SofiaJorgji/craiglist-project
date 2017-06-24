package com.sqa.sj;

import com.sqa.sj.helpers.*;

/**
 * PetRegistration
 *
 * @author Jorgji, Sofia
 * @version 1.0
 */
public class PetRegistration {

	private static String appName = "Pet Registration";

	private final static double REG_COST = 45.00;

	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		registerPets();
		AppBasics.farewellUser(name);
	}

	/**
	 * Main method to register pets into the system.
	 */
	private static void registerPets() {
		int numOfPets = AppBasics.requestIntWithinRange("How many pets would you like to register?", 1, 5,
				"You can only register 1 - 5 pets into the system at a time.");
		System.out.println("You are registering " + numOfPets + " pets.");
		int numOfYears = AppBasics.requestIntWithinRange("How many years would you like to register your pet(s)", 1, 10,
				"You can only register your pet(s) for 1 - 10 years");
		double totalRegistrationCost = numOfPets * numOfYears * REG_COST;
		System.out.printf("It will cost a total of %.2f to register your pet(s).", totalRegistrationCost);
	}
}

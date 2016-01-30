/**
 * File Name: PetRegistration.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 27, 2016
 */
package com.sqa.em.pet.registration;

import java.util.Scanner;

import com.sqa.em.util.helper.RequestInput;
import com.sqa.em.util.helper.UpdateArray;

/**
 * PetRegistration
 * <p>
 * PetRegistration // Create an application which takes registered a local pet
 * into the pet data system. The application should ask how many pets they would
 * like to register. For each pet they should be asked what type (dog, cat,
 * fish, bird, reptile, or horse). If the type is not a valid register pet it
 * should let the user know. If it is, it should echo the price to register the
 * pet for 1 year and confirm price with user. (Use a switch statement). If the
 * user decides to follow through with the registration process, they should
 * then enter the pets Name (String), Address(String), Age(int), Whether they
 * have a rabies shot (boolean), Yearly Pet Fees (double), and Gender (char).
 * The number of pets that will be entered into the array should be determined
 * at the start of the application. Upon exiting the registered pet details
 * should be echoed to the user.
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class PetRegistration {

	private static String[] types;

	private static String[] names;

	private static String[] addresses;

	private static int[] ages;

	private static double[] petsFeeds;

	private static boolean[] hasRabies;

	private static char[] genders;

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		registerPets(RequestInput.getInt("Enter the number of Pets that you want to register? "));
		displayPets();
		// Exit the system
		exitPetRegApp();
	}

	/**
	 * @param type
	 *            output all the animals that have been registers.
	 */
	private static void addAnimal() {
	}

	/**
	 * Will display all the animals that have been registered and other details
	 * for each animal
	 */
	private static void displayPets() {
		// TODO Implement display Pets method
		if (types != null) {
			System.out.println("*** This are the animals that you have register ***");
			for (int i = 0; i < types.length; i++) {
				System.out.println("\tType: " + types[i]);
				System.out.println("\tAge: " + ages[i]);
				System.out.println("\tName: " + names[i]);
				System.out.println("\tAddress: " + addresses[i]);
				System.out.println("\tPets Feeds for year: " + petsFeeds[i]);
				System.out.println("\tHas rabies: " + hasRabies[i]);
				System.out.println("\tGender: " + genders[i]);
			}
		} else {
			System.out.println("You have not registered any animals :-(");
		}
	}

	/**
	 * Will display a message and exit the application.
	 */
	private static void exitPetRegApp() {
		scanner.close();
		System.out.println("\n\nThank you for using the Pet Reister Application!\n Good Bye.");
		System.exit(0);
	}

	/**
	 * Will ask the user if they want to register the animal. If registration =
	 * Yes(true) then the animal will be added to the registration array
	 *
	 * @param regPrice
	 *            the price of the animal(double)
	 * @param animalType
	 *            the animal that will be registering
	 * @return
	 */
	private static void registerAnimal(double regPrice, String animalType) {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the animal
		System.out.println("To register a " + animalType + " it is $" + regPrice + " a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the " + animalType + "?");
		// If the user has requested to register the pet
		if (willRegister == true) {
			// Add the type of animal being registered to the types array
			types = UpdateArray.addStringElement(types, animalType);
			// else they did not want to register their pet
		} else {
			// Give them a message noting they won't be registering it
			System.out.println("Sorry to hear you do not want to register your " + animalType + ".");
		}
	}

	/**
	 * Will invoke the method validatePetRegistration() for all of pets you will
	 * be registering Then will invoke requestAnimalDetails() to get the
	 * details. Will get the details of all the animals that have been register
	 *
	 * @param numPets
	 */
	private static void registerPets(int numPets) {
		for (int i = 0; i < numPets; i++) {
			validatePetRegistration();
		}
		requestAnimalDetails();
	}

	/**
	 * Request details for all animal of all the animals that have been
	 * registered private static String[] types;
	 */
	private static void requestAnimalDetails() {
		names = new String[types.length];
		addresses = new String[types.length];
		ages = new int[types.length];
		petsFeeds = new double[types.length];
		hasRabies = new boolean[types.length];
		genders = new char[types.length];
		for (int i = 0; i < types.length; i++) {
			System.out.println("\nRegistration will start now :-) for your " + types[i]
					+ ", could you please provide the following details:");
			names[i] = RequestInput.getString("whats is yours " + types[i].toLowerCase() + "'s name? ");
			addresses[i] = RequestInput.getString("What is the " + types[i].toLowerCase() + "'s address? ");
			ages[i] = RequestInput.getInt("What is the " + types[i].toLowerCase() + "'s age? ");
			petsFeeds[i] = RequestInput.getDouble("What would be your " + types[i].toLowerCase() + "'s petsFeeds? ");
			hasRabies[i] =
					RequestInput.getBoolean("Has your " + types[i].toLowerCase() + "'s been give a rabies shot? ");
			genders[i] = RequestInput.getChar("What is the " + types[i].toLowerCase() + "'s genders (F/M)? ", 'F', 'f',
					'M', 'm');
		}
	}

	/**
	 * Tell the user the price to register the animal and ask if they want to
	 * proceed.
	 *
	 * @param cost
	 *            The price of the animal
	 * @param animal
	 *            The type of animal
	 * @return boolean stating if they wanted to register private static boolean
	 *         registerAnimal(int cost, String animal) { System.out.println(
	 *         "To register a " + animal + " is $" + cost); return
	 *         RequestInput.getBoolean("Would you like to register the " +
	 *         animal + "? "); }
	 */
	/**
	 * Method which will ask user to enter the dog they want to register. If dog
	 * is found will display the feeds and ask if they still want to register.
	 * If register continues then it will be added to the array.
	 */
	private static void validatePetRegistration() {
		// Setup variable to create continuous loop based on invalid pets type
		boolean hasInvalidPet = true;
		boolean willRegister;
		String type = null;
		while (hasInvalidPet) {
			type = RequestInput.getString("\nWhat type of pet do you have? ");
			switch (type.toLowerCase()) {
			case "dog":
				registerAnimal(120, type);
				hasInvalidPet = false;
				break;
			case "cat":
				registerAnimal(100, type);
				hasInvalidPet = false;
				break;
			case "fish":
				registerAnimal(140, type);
				hasInvalidPet = false;
				break;
			case "horse":
				registerAnimal(25, type);
				hasInvalidPet = false;
				break;
			case "reptile":
				registerAnimal(10, type);
				hasInvalidPet = false;
				break;
			case "bird":
				registerAnimal(75, type);
				hasInvalidPet = false;
				break;
			default:
				System.out.println(type + " cannot be register at this time, Invalid Animal :-( ");
				break;
			}
		}// while
	}// method
}

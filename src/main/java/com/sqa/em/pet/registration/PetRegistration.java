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

	private static int numPets;

	private static String[] types;

	private static String[] names;

	private static String[] addresses;

	private static int[] ages;

	private static double petsFeeds;

	private static boolean hasRabies;

	private static char[] genders;

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String petType;
		// Set the number of pets based on
		numPets = RequestInput.getInt("Enter the number of Pets that you want to registre? ");
		// Register number of pets chosen
		// petType = registerNatives();
		// Display registered pets to the user
		displayPets();
		// Exit the system
		exitPetRegApp();
	}

	/**
	 * @param type
	 *            the type of animal that will used to collect the details.
	 */
	private static void addAnimal(String type) {
		// static CONSTANT int i = 0;
		// types[i] = type;
		// names;
		// addresses;
		// ages;
		// petsFeeds;
		// hasRabies;
		// genders;
	}

	/**
	 * Will
	 */
	private static void displayPets() {
		// TODO Implement display Pets method
	}

	/**
	 * Will display a message and exit the application.
	 */
	private static void exitPetRegApp() {
		scanner.close();
		System.out.println("Thank you for using the Pet Reister Application!\n Good Bye.");
		System.exit(0);
	}

	/**
	 * Tell the user the price to register the animal and ask if they want to
	 * proceed.
	 *
	 * @param cost
	 *            = the price of the animal
	 * @param animal
	 *            = the type of animal
	 * @return boolean stating if they wanted to register
	 */
	private static boolean registerAnimal(int cost, String animal) {
		System.out.println("To register a " + animal + " is $" + cost);
		return RequestInput.getBoolean("Would you like to register the " + animal + "? ");
	}

	/**
	 * Method which will ask user to enter the dog they want to register. If dog
	 * is found will display the feeds and ask if they still want to register.
	 * If register continues then it will be added to the array.
	 */
	private static void registerNatives() {
		// Setup variable to create continuous loop based on invalid pets type
		boolean hasInvalidPet = true;
		boolean willRegister;
		String type = null;
		while (hasInvalidPet) {
			type = RequestInput.getString("What type of pet do you have? ");
			switch (type) {
			case "dog":
				willRegister = registerAnimal(120, "dog");
				System.out.println("Add a dog");
				if (willRegister) {
					addAnimal(type);
				}
				hasInvalidPet = false;
				break;
			case "cat":
				willRegister = registerAnimal(120, "cat");
				System.out.println("Add a cat");
				hasInvalidPet = false;
				break;
			case "fish":
				willRegister = registerAnimal(120, "fish");
				System.out.println("Add a fish");
				hasInvalidPet = false;
				break;
			case "horse":
				willRegister = registerAnimal(120, "horse");
				System.out.println("Add a horse");
				hasInvalidPet = false;
				break;
			case "reptile":
				willRegister = registerAnimal(120, "reptile");
				System.out.println("Add a reptile");
				hasInvalidPet = false;
				break;
			case "bird":
				willRegister = registerAnimal(120, "bird");
				System.out.println("Add a bird");
				hasInvalidPet = false;
				break;
			default:
				System.out.println("Invalid animal");
				break;
			}
		}// while
	}// method
}

/**
 * File Name: RequestInput.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 27, 2016
 */
package com.sqa.em.util.helper;

import java.util.Arrays;
import java.util.Scanner;

/**
 * RequestInput //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class RequestInput {

	// Do recieve input from the users keyboard
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Will add one element to an existing array
	 *
	 * @param elements
	 *            An array of strings.
	 * @param addString
	 *            The one that will be added to the array
	 * @return will return the array of strings.
	 */
	public static String[] addStringElement(String[] elements, String addString) {
		// Declaration of variables
		String[] newStringArray;
		if (elements != null) {
			newStringArray = Arrays.copyOf(elements, elements.length + 1);
			newStringArray[elements.length - 1] = addString;
		} else {
			newStringArray = new String[1];
			newStringArray[0] = addString;
		}
		return elements;
	}

	/**
	 * Static Helper Method ask user for an input (Yes/No) if such input is not
	 * enter will loop until it is selected
	 * 
	 * @return boolean Is based on Yes/No input from the user
	 */
	public static boolean getBoolean(String question) {
		String input;
		while (true) {
			System.out.print(question + " (Yes/Y) or (No/N): ");
			input = scanner.nextLine();
			if (input.equalsIgnoreCase("Yes") || (input.equalsIgnoreCase("Y"))) {
				return true;
			} else if (input.equalsIgnoreCase("No") || (input.equalsIgnoreCase("N"))) {
				return true;
			} else
				System.out.println("You have not enter a valid option, please choose Yes/Y or No/N.");
		}
	}

	/**
	 * Static Helper Method which asks user for a char. If more or less than one
	 * char is entered it will loop until only one is entered.
	 * 
	 * @return the char the user enter
	 */
	public static char getChar(String question) {
		// Local variable to hold input
		String input;
		char character = ' ';
		// Infinit loop to look out for valid options
		while (true) {
			try {
				// Ask the user a question to get relative input
				System.out.print(question);
				// Set the input based on what the user enters on their keyboard
				input = scanner.nextLine();
				// Check that the input String is one character long
				if (input.length() < 1) {
					throw new IllegalArgumentException("too few chars");
				} else if (input.length() > 1) {
					throw new IllegalArgumentException("too many chars");
				}
				// Convert the String into a char value
				character = input.charAt(0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
			return character;
		}
	}

	/**
	 * Method will ask the user for a char and return only if the char matches
	 * the ones form the available in the array.
	 * 
	 * @param question
	 *            Message that will be ask the user the type of input requested.
	 * @param characters
	 *            is the arrays of the available characters.
	 * @return the char that the user entered.
	 */
	public static char getChar(String question, char... characters) {
		while (true) {
			boolean present = false;
			char charFromUser = RequestInput.getChar(question);
			// Iterate through the supplied chars and see if it is present
			for (int i = 0; i < characters.length; i++) {
				if (Character.compare(characters[i], charFromUser) == 0) {
					present = true;
				}
			}
			if (present == true) {
				return charFromUser;
			} else {
				continue;
			}
		}
	}

	/**
	 * Method will ask the user for a double and return only if the double is
	 * valid.
	 * 
	 * @param question
	 *            Message that will be ask the user the type of input requested.
	 * @return num entered by the user
	 */
	public static double getDouble(String question) {
		double numFromUser = 0;
		while (true) {
			try {
				System.out.print(question);
				numFromUser = Double.parseDouble(scanner.nextLine());
				break; // Refers to the while loop
			} catch (NumberFormatException e) {
				System.out.println("You have not enter a valid number.");
				continue; // Not needed but it is used for clarity purpose
							 // Right now
			}
		}
		return numFromUser;
	}

	/**
	 * Method ask user for a number. If a number is not enter it will loop
	 * Indefinitely.
	 * 
	 * @param question
	 *            Message that will be ask the user the type of input requested.
	 * @return The number will be return
	 */
	public static int getInt(String question) {
		int numFromUser = 0;
		while (true) {
			try {
				System.out.print(question);
				numFromUser = Integer.parseInt(scanner.nextLine());
				// if (num > 8) throw new IllegalArgumentException();
				break; // Refers to the while loop
			} catch (NumberFormatException e) {
				System.out.println("You have not enter a valid number.");
				continue; // Not needed but it is used for clarity purpose
							 // Right now
			}
		}
		return numFromUser;
	}

	/**
	 * Method ask user for a number. If a number is not enter it will loop
	 * Indefinitely.
	 * 
	 * @param question
	 *            Message that will be ask the user the type of input requested.
	 * @return The number will be return TODO max min need to update the getInt
	 */
	public static int getInt(String question, int max, int min) {
		int numFromUser = 0;
		while (true) {
			try {
				System.out.print(question);
				numFromUser = Integer.parseInt(scanner.nextLine());
				if (numFromUser <= max && numFromUser >= min) {
					throw new IllegalArgumentException("Your number needs to be between " + min + " and " + max);
				}
				break; // Refers to the while loop
			} catch (NumberFormatException e) {
				System.out.println("You have not enter a valid number.");
				continue; // Not needed but it is used for clarity purpose
							 // Right now
			}
		}
		return numFromUser;
	}

	/**
	 * Method ask user for an input string
	 * 
	 * @param question
	 *            Message that will be ask the user the type of input requested.
	 * @return The string will be return
	 */
	public static String getString(String question, String... words) {
		while (true) {
			boolean present = false;
			String stringFromUser = RequestInput.getString(question);
			// Iterate through the supplied chars and see if it is present
			for (int i = 0; i < words.length; i++) {
				if (words[i].equals(stringFromUser)) {
					present = true;
				}
			}
			if (present == true) {
				return stringFromUser;
			} else {
				continue;
			}
		}
	}
	// Create your own helper method that you may find useful
}

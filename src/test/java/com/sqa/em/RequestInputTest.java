/**
 * File Name: RequestInputTest.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 28, 2016
 */
package com.sqa.em;

import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

import com.sqa.em.util.helper.RequestInput;
import com.sqa.em.util.helper.UpdateArray;

/**
 * RequestInputTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class RequestInputTest {

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.RequestInput#addStringElement(java.lang.String[], java.lang.String)}
	 * .
	 */
	@Test
	@Ignore
	public void testAddStringElement() {
		String[] myElements = new String[] { "baseball", "soccer ball", "football", "tennis ball" };
		String[] myNewElements = UpdateArray.addStringElement(myElements, "racket ball");
		System.out.println("Old elements:" + Arrays.toString(myElements));
		System.out.println("New elements:" + Arrays.toString(myNewElements));
		myNewElements = UpdateArray.addStringElement(myNewElements, "racket2 ball2");
		System.out.println("New elements:" + Arrays.toString(myNewElements));
		myNewElements = UpdateArray.addStringElement(myNewElements, "racket21 ball21");
		System.out.println("New elements:" + Arrays.toString(myNewElements));
		myNewElements = UpdateArray.addStringElement(myNewElements, "racket21 ball21");
		System.out.println("New elements:" + Arrays.toString(myNewElements));
	}

	/**
	 * Test method for being able to return Yes(Y) or No(N)
	 * {@link com.sqa.em.util.helper.RequestInput#getBoolean(java.lang.String)}.
	 */
	@Test
	@Ignore
	// FIXME Is this a boolean evethough we are only asking for a string?
	public void testGetBoolean() {
		boolean bln = RequestInput.getBoolean("Enter True or False nope entering Yes or No");
		System.out.println(" This looks more as a string than a boolean " + bln);
	}

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.RequestInput#getChar(java.lang.String)}.
	 */
	@Test
	// @Ignore
	public void testGetCharString() {
		char value = RequestInput.getChar("What are you entering? ");
		System.out.println("The lucky number was " + value);
	}

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.RequestInput#getChar(java.lang.String, char[])}
	 * .
	 */
	@Test
	@Ignore
	public void testGetCharStringCharArray() {
	}

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.RequestInput#getDouble(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetDouble() {
		double value = RequestInput.getDouble("How much money do you have on hand? ");
		System.out.println("The amount of money in your pocket is $" + value);
	}

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.RequestInput#getInt(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetIntString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.RequestInput#getInt(java.lang.String, int, int)}
	 * .
	 */
	@Test
	@Ignore
	public void testGetIntStringIntInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.RequestInput#getString(java.lang.String, java.lang.String[])}
	 * .
	 */
	@Test
	@Ignore
	public void testGetString() {
		String stringReturn = RequestInput.getString("enter abc, 123 or exit to exit or else will continue in a loop",
				"abc", "123", "exit");
		System.out.println("Your return string is " + stringReturn);
	}
}

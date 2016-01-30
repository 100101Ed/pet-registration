/**
 * File Name: UpdateArray.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 30, 2016
 */
package com.sqa.em.util.helper;

import java.util.Arrays;

/**
 * UpdateArray //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class UpdateArray {

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
			newStringArray[elements.length] = addString;
		} else {
			newStringArray = new String[1];
			newStringArray[0] = addString;
		}
		return newStringArray;
	}
}

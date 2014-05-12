package daily;

import javax.swing.*;
import java.util.*;

public class RandomNumbers {
	public static void main(String[] args) {
		/*
		 * This program asks the user how many times they would like to roll a
		 * set of two dice. It will generate random numbers between 1 and 6,
		 * displaying the results to the user neatly in table format.
		 */

		// Get value for number of dice rolls
		String numOfRollsString = JOptionPane.showInputDialog(null,
				"How many times would you like to roll the dice?",
				"Random Number Generator", JOptionPane.QUESTION_MESSAGE);

		// Convert numOfRollsString to integer.
		int numOfRollsInt = Integer.parseInt(numOfRollsString);
		JOptionPane.showMessageDialog(null, "The dice will be rolled "
				+ numOfRollsInt + " times.");

		// Declare and create an array
		int[] rollResults = rollAndCountArray(numOfRollsInt);

		// Display counts
		System.out.println();
		System.out.println("The occurrences of each die value when rolled "
				+ numOfRollsInt + " times are: ");
		System.out.println("Dice Value\t|\t Frequency");
		displayCounts(rollResults);
	}

	// Create an array of numbers
	public static int[] rollAndCountArray(int numOfRolls) {
		// Declare an array of numbers and create it
		int[] rollResults = new int[12];

		// Create numbers between 2 and 12 randomly and assign them to the array
		Random rand = new Random();

		// Generate random numbers between 2 and 12.
		for (int i = 0; i < numOfRolls; i++) {
			int diceResult = rand.nextInt(11) + 2;
			rollResults[diceResult - 1] += 1;
		}

		// Return the array
		return rollResults;
	}

	// Display counts
	public static void displayCounts(int[] counts) {
		for (int i = 1; i < counts.length; i++) {
			System.out.println("\t" + (i + 1) + "\t\t|\t\t " + counts[i]);

		}
	}

}
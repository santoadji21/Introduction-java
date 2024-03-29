/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author 21129798
 */
public class Exercises_5_23 {
    public static void main(String[] args) {
		final int NUMNBER_OF_UPPERCASE_LETTERS = 100; // Number of uppercase letters
		final int NUMNBER_OF_SINGLE_DIGITS = 100;	// Number of single digits
		final int NUMBERS_PER_LINE = 10; // Print 10 characters per line

		// Print 100 uppercase letters
		for (int i = 1; i <= NUMNBER_OF_UPPERCASE_LETTERS; i++) {
			System.out.print(getRandomUpperCaseLetter());
			System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
		}

		// Print 100 single digits
		for (int i = 1; i <= NUMNBER_OF_SINGLE_DIGITS; i++) {
			System.out.print(getRandomDigitCharacter());
			System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
		}
	}
    
    
    
    public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	/** Generate a random lowercase letter */
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	/** Generate a random uppercase letter */
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	/** Generate a random digit character */
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

	/** Generate a random character */
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
}
    



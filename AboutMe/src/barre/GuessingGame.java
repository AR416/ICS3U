/**
 * 
 */
package barre;
import java.util.Scanner;
/**
 * GuessingGame.java
 * A number guessing game played between the computer and one person.
 * created November 20th 2016
 * Abdirahman Barre
 */
public class GuessingGame {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		int RandomNumber;
		int PersonNumber;
		int Computer;
		
		System.out.print("Enter a number between 1 and 20:");
		PersonNumber =  scan.nextInt();
		RandomNumber = (int) (Math.random()*20)+1;
		Computer = (int) (Math.random()*20)+1;
		if (PersonNumber==RandomNumber){
			System.out.println("Computer's number" + Computer);
			System.out.println("Person's number:" + PersonNumber); 
			System.out.println("You won!");
		} 
		 else{ 
	    
	     System.out.println("Computer's number:" + Computer);
		 System.out.println("Person's number:" + PersonNumber);
		 System.out.println("Better luck next time.");
		}

	}}

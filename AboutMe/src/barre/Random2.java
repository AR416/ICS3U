/**
 * 
 */
package barre;
import java.util.Scanner;
/**
 * Random2.java
 * a program that stimulates a rolling of two dices, one for the person and the other for the computer.
 * created November 10th 2016
 * Abdirahman Barre
 */

public class Random2 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int die1;  int computerdie1;  int usertotal;
		int die2;  int computerdie2;  int computertotal;
		
		die1= (int)(Math.random()*11)+1;
		die2= (int)(Math.random()*11)+1;
		computerdie1= (int)(Math.random()*11)+1;
		computerdie2= (int)(Math.random()*11)+1;
		
		usertotal= die1 + die2;
		computertotal= computerdie1+computerdie2;
		
		if (usertotal>computertotal){
			System.out.println("Total of rolled dice number from user is:" + usertotal);
			System.out.println("Total of rolled dice number from computer is:" + computertotal);
			System.out.println("Congratulations, User won.");
			
		}
		
		else if (usertotal==computertotal){
		    System.out.println("Total of rolled dice number from user is:" + usertotal);
		    System.out.println("Total of rolled dice number from computer is:" + computertotal);
		    System.out.println("Computer and User was a tie.");
		    
	    }
	
	    else {
	    	System.out.println("Total of rolled dice number from computer is:" + computertotal);
			System.out.println("Total of rolled dice number from user is:" + usertotal);
			System.out.println("Congratulations, Computer won.");
	    	

		
		}

	}}



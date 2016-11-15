/**
 * 
 */
package barre;
import java.util.Scanner;
/**
 * Random1.java
 * the program asks for the persons name and 70% of the time gives there favorite name.
 * created November 9th 2016
 * Abdirahman Barre
 */
public class Random1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double percentage;
		String name;
		
		System.out.print("Enter your name:");
		name = scan.nextLine();
		percentage = Math.random();
		
		if (percentage>=0.7){
			System.out.println("This is not your favorite name.");
		} 
		 else{ System.out.println("This name is your favorite name.");
		}

	}

}

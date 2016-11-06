/**
 * 
 */
package barre;

import java.util.Scanner;

/*order.Java
 * 
 *created November 4th 2016 
 *Switch Statements 
 *abdirahman barre
 */
public class SwitchStatment {

	public static void main(String args[]) 
	{
		String Day = null  ;
		
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number.");
	String Week1 = scan.nextLine();

		String monday = ("Monday");
		switch (Week1.toLowerCase()) 
	{
	        case "1":
	            Day = monday;
	            break;
	        case "2":
			String tuesday = ("Tuesday");
			Day = tuesday;
	            break;
	        case "3":
			String wednesday = ("wednesday");
			Day = wednesday;
	            break;
	        case "4":
			String thursday = ("thursday");
			Day = thursday;
	            break;
	        case "5":
			String friday = ("friday");
			Day = friday;
	            break;
	        case "6":
			String saturday = ("saturday");
			Day = saturday;
	            break;
	        case "7":
			String sunday = ("sunday");
			Day = sunday;
	            break;
	       
	        
	    }

	    System.out.println(Day);
	}
	}


/**
 * 
 */
package barre;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Integer.java
 * 
 *created November 10th 2016
 *Assigns a grade that best suits a persons mark.
 *abdirahman barre 
 */
public class Grade {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		int marks;
		char grade;
		
		System.out.print("Enter the precentage:");
		marks = scan.nextInt();
		
		if (marks >=90){
			grade = 'A';
			
		}
		
		else if (marks >=80){
			grade = 'B';

	    }
		else if (marks >=70){
			grade = 'C';
	
			
	    }
		
		else if (marks >=60){
			grade = 'D';

        }
		
		else {
			grade = 'F';
			
		}
		
		System.out.println("The corresponding letter grade is:" + grade);
		
	}}

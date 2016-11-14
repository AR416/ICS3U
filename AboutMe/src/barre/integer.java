/**
 * 
 */
package barre;
import java.util.Scanner;
/*Integer.java
 * 
 *created September 30th 2016
 *determining whether an integer is positive or negative 
 *abdirahman barre 
 */

public class integer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A;
	   
		System.out.println("Input a number.");
		 A = scan.nextInt();
		if (A>0){
		
		System.out.println("The number is a positive.");
		} else if (A<0){
			System.out.println("The number is a negative.");
			
		} System.out.println("The remander is:");
		System.out.println(A%7);
		System.out.println("If the remainder is 0, the number is divisible by 7. If not, then the number is not divisable by 7.");
		}
		

	}



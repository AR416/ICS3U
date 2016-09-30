/**
 * 
 */
package barre;
import java.util.Scanner;
/*QuadraticFormula.java
 * 
 *created September 30th 2016
 *solving quadratic formulas 
 *abdirahman barre 
 */

public class QuadraticFormula {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int A;
		int B; 
		int C;
		
		System.out.println("Calculate the quadratuc formula for the following numbers.");
		
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		
		System.out.println((-B + Math.sqrt(Math.pow(B,2)-4 *A*C))/2*A);
		System.out.println((-B - Math.sqrt(Math.pow(B,2)-4 *A*C))/2*A);

	}

}

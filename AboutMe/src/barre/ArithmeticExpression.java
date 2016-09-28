/**
 * 
 */
package barre;
import java.util.Scanner;
/*ArithmeticExpression.java 
 * 
 *created September 26th 2016
 *generates arithmetic expressions
 *abdirahman barre
 */



public class ArithmeticExpression {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		System.out.println("Input 5 numbers.");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		num4 = scan.nextInt();
		num5 = scan.nextInt();
		
		
		System.out.println("The sum of these numbers is " + (num1+num2+num3+num4+num5));
		System.out.println("The result after subtracting the second number from the third " + (num2-num3));
		System.out.println("The product of the first and fifth numbers is " + (num1*num5));
		System.out.println("The quotient of the fourth number divided by the second is " + (num4/num2));
		System.out.println("The remainder when dividing the fourth number by the second is " + (num4%num2));
		System.out.println("The first number raised to the power of the third number is " + (num1^num3));
		System.out.println("The square root of the fifth number is " + Math.sqrt(num5));
		
		

	}

}

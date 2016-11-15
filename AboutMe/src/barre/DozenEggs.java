/**
 * 
 */
package barre;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Integer.java
 * 
 *created November 15th 2016
 *Asks for amount of eggs purchased and determines its price.
 *abdirahman barre 
 */
public class DozenEggs {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double EggNum;
		
		
		System.out.print("Enter the number of eggs purchased:");
		EggNum= scan.nextDouble();
		EggNum= EggNum/12;
		
		if (EggNum >=11){
			
			System.out.println("The bill is equal to: $" + (df.format(0.35*EggNum)));
			
		}
		else if (EggNum>=6){
			System.out.println("The bill is equal to: $" + (df.format(0.40*EggNum)));
		}
		else if (EggNum>=4){
			System.out.println("The bill is equal to: $" + (df.format(0.45*EggNum)));
		

	}   else {
		
		System.out.println("The bill is equal to: $" + (df.format(0.50*EggNum)));
	}

}}

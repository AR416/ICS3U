/**
 * 
 */
package barre;

import java.util.Scanner;
import java.text.DecimalFormat;
/*order.Java
 * 
 *created October 11th 2016 
 *calculate total for a order
 *abdirahman barre
 */
public class order {

	
	public static void main(String[] args) {
		
		
		double priceofburger = 1.69;

		double priceoffries = 1.09;

		double priceofsoda = 0.99;

		int numberofburgers;

		int numberoffries;

		int numberofsoda;

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");

		System.out.println("Enter the number of burgers:");

		numberofburgers= scan.nextInt();

		System.out.println("Enter the number of fries:");

		numberoffries= scan.nextInt();

		System.out.println("Enter the number of soda:");

		numberofsoda= scan.nextInt();

		System.out.println("Total before tax:$" +df.format (priceofburger* numberofburgers + priceoffries*numberoffries + priceofsoda*numberofsoda));

		double tax = (priceofburger* numberofburgers + priceoffries*numberoffries + priceofsoda*numberofsoda) * 0.065;
		double Totalprice = ((priceofburger* numberofburgers+priceoffries*numberoffries+priceofsoda*numberofsoda));

		System.out.println("Tax:$" + df.format (tax));

		System.out.println("Final total:$" + df.format ( tax + Totalprice));
		
		System.out.println("Enter amount tendered:");
		
		double amountgiven;
		
		amountgiven= scan.nextInt();
		
		System.out.println("Change:$" + df.format (amountgiven - (Totalprice + tax) ));
		
	}

}

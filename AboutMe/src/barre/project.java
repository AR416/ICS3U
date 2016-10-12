/**
 * 
 */
package barre;
import java.text.DecimalFormat;
import java.util.Scanner;
/*project.Java
 * 
 *created October 12th 2016 
 *get number from user and get p
 *abdirahman barre
 */
public class project {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Designing;
		int Coding;
		int Debugging;
		int Testing;
		System.out.print("Designing:");   Designing = scan.nextInt();
		System.out.print("Coding:");      Coding = scan.nextInt();
		System.out.print("Debugging:");   Debugging = scan.nextInt();
		System.out.print("Testing:");     Testing = scan.nextInt();
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double Totaltime = Designing + Coding + Debugging + Testing;
		double POfD = (Designing/Totaltime)*100;
		double POfC = (Coding/Totaltime)*100;
		double POfDE =(Debugging/Totaltime)*100;
		double POfT= (Testing/Totaltime)*100;
		
		System.out.println("Task       %Time" );
		System.out.println("Designing  "+df.format (POfD));
		System.out.println("Coding     "+df.format (POfC) );
		System.out.println("Debugging  "+df.format (POfDE)  );
		System.out.println("Testing    "+df.format (POfT) );
				

	}

}

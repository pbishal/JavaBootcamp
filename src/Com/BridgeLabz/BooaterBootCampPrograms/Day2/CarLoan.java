package Com.BridgeLabz.BooaterBootCampPrograms.Day2;
import java.util.Scanner;

public class CarLoan {
	public static void main(String args[])
	{
		 System.out.println("Enter The Value Of P: ");
	     Scanner sc= new Scanner(System.in);
	     Double p = sc.nextDouble();
	     
		 System.out.println("Enter The Value Of Y: ");
	     Double Y = sc.nextDouble();
		
		 System.out.println("Enter The Value Of R: ");
	     Double R = sc.nextDouble();
	     
	     double n =12*Y;
	     double r= R/(12*100);
	     
	     double payment=(p*r)/(1-Math.pow((1+r), (-n)));
	     System.out.println(payment);
	}

}

package Com.BridgeLabz.BooaterBootCampPrograms.day9;
import Com.BridgeLabz.BooaterBootCampPrograms.day1.Utility;
import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility=new Utility();
        Scanner scanner = new Scanner(System.in);
        int c;
        double result;
        System.out.println("Enter value");
        c = scanner.nextInt();
        if (c > 0) {
            result = utility.findSquareRootUsingNewtonsMethod(c);
            System.out.println("Square Root of " + c + " using Newtons Law is " + result);
        } else {
            System.out.println("Please enter positive value..");
        }

	}

}

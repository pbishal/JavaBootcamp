package Com.BridgeLabz.BooaterBootCampPrograms.day9;
import java.util.Scanner;

import Com.BridgeLabz.BooaterBootCampPrograms.day1.MathFunction;
import Com.BridgeLabz.BooaterBootCampPrograms.day1.Utility;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scan.nextInt();
        MathFunction.fact(number);

	}

}

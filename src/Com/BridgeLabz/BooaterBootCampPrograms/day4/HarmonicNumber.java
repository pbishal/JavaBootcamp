package Com.BridgeLabz.BooaterBootCampPrograms.day4;
import java.util.Scanner;

import Com.BridgeLabz.BooaterBootCampPrograms.day1.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n for Harmonic Series");
        int num=scanner.nextInt();
        System.out.print("H" +num+ " = ");

        Utility.harmonicSeries(num);

	}

}

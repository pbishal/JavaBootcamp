package Com.BridgeLabz.BooaterBootCampPrograms.day5;
import Com.BridgeLabz.BooaterBootCampPrograms.day1.Utility;
import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        System.out.println("Enter the Power of Two : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Utility.powerOf(n);

	}

}

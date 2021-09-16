package Com.BridgeLabz.BooaterBootCampPrograms.day12;
import Com.BridgeLabz.BooaterBootCampPrograms.day1.Utility;
import java.util.Scanner;

public class DistinctCoupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Utility utility = new Utility();
        System.out.println("enter number for generate coupons");
        int range = scanner.nextInt();
        int count=utility.distinctCoupon(range);
        System.out.println(count + " N times loop runs for finding distinct");
        scanner.close();

	}

}

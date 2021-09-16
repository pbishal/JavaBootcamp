package Com.BridgeLabz.BooaterBootCampPrograms.Day2;
import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num ;
        Scanner sc = new Scanner( System.in );
        System.out.print("Input a number: ");
        num = sc.nextInt();
        double result = 0.0;
        while(num > 0){
            result = result + (double) 1 / num;
            num--;
        }
        System.out.println("Output of Harmonic Series is "+result);
	}

}

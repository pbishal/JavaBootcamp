package Com.BridgeLabz.BooaterBootCampPrograms.day7;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Decimal Number ::");
        int num= sc.nextInt();
        String bin=" ";
        do {
            int rem =num % 2;
            bin=rem + bin;
            num = num / 2;
        }while(num!=0);
        System.out.println("Binary Number is : " +bin);
        sc.close();

	}

}

//package Com.BridgeLabz.BooaterBootCampPrograms.Day3;
//import java.util.Scanner;
//
//public class Binary {
//    public static void binary(int number)
//    {
//        int[] binary = new int[100];
//        int i = 0;
//        while(number != 0)
//        {
//            binary[i] = number % 2;
//            number = number / 2;
//            i++;
//        }
//        System.out.println("The binary value is: ");
//        for (int j = i - 1; j >= 0 ; j--) {
//            System.out.print(binary[j]);
//        }
//    }
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a decimal number: ");
//        int number = scan.nextInt();
//
//        binary(number);
//
//	}
//
//}

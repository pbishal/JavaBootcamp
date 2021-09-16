//package Com.BridgeLabz.BooaterBootCampPrograms.Day3;
//import java.util.Random;
//import java.util.Scanner;
//
//public class RollDie {
//    public static void rollDie(int times) {
//        int[] arr = new int[times];
//        int maxCounter = 0;
//        int element = 0;
//        Random random = new Random();
//        for (int i = 0; i < times; i++) {
//            arr[i] = random.nextInt(6) + 1;
//            System.out.println(arr[i]);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            int counter = 1;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    counter++;
//                }
//            }
//            if (maxCounter < counter) {
//                maxCounter = counter;
//                element = arr[i];
//            }
//        }
//        System.out.println("Face of die repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
//    }
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number of times the dice rolls: ");
//        int times = scan.nextInt();
//
//        rollDie(times);
//
//	}
//
//}

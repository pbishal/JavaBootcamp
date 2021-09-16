package Com.BridgeLabz.BooaterBootCampPrograms.Day3;
import java.util.Scanner;

public class RepeatedNumbers {
    public static void checkDuplicate(int[] arr, int size) {
        System.out.println("The input array is: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    System.out.println("The repeated number is: " + arr[j]);
                break;
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

       checkDuplicate(arr,size);

	}

}

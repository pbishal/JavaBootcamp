package Com.BridgeLabz.BooaterBootCampPrograms.day14;
import Com.BridgeLabz.BooaterBootCampPrograms.day1.Utility;
import java.util.Arrays;

public class InsertationSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
        System.out.println("Enter no. of words to be printed: ");
        int n=u.inputInteger();

        //create string array
        String array[]=new String[n];
        System.out.println();
        System.out.println("Enter the words to be printed: ");

        for(int i=0;i<array.length;i++)
        {
            array[i]=u.inputString();
        }
        System.out.println();

        //sort string array using Arrays.sort method
        System.out.println("Sorted order is: ");
        for(int i=0;i<array.length;i++)
        {
            Arrays.sort(array);
            System.out.println(array[i]);
        }

	}

}

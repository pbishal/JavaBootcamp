package Com.BridgeLabz.BooaterBootCampPrograms.test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		int[] arr =new int[] {1, 2, 3, 4, 4, 8, 7, 1, 8};
		for(int i=0; i<arr.length; i++) {
			//System.out.println(arr[i]);
			for(int j=i+1; j<arr.length;j ++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[j]);
					count++;
				}
			}
		}
		System.out.println("The Duplicate Number Count Is :"+ count);

	}

}

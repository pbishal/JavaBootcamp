package Com.BridgeLabz.BooaterBootCampPrograms.day15;
import Com.BridgeLabz.BooaterBootCampPrograms.day1.Utility;
import java.util.Scanner;
import java.util.Date;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();

        UserDetails user=new UserDetails();
        System.out.println();

        //asking user to enter his data
        System.out.println("Enter FirstName:");
        user.setfName(u.inputString());
        System.out.println();

        System.out.println("Enter LastName:");
        user.setlName(u.inputString());
        System.out.println();

        System.out.println("Enter Mobile Number:");
        user.setmobileNo(u.inputString());
        System.out.println();

        //Setting current date
        user.setdate(u.getFormatedDate(new Date()));
        System.out.println(u.convertString(user,u.getFileText("newfile.txt")));

	}

}

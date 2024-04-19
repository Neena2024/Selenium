package String;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in); //scanner class is used to type anything in keyboard and system.in will represent keyboard input
		String s = sc.next();  //next will store the typed input in console
		int var = s.length();
		String rvr = "";
		for (int i =var-1;i>=0;i--)
		{
		rvr = rvr+s.charAt(i);
		}
		System.out.println(rvr);
	
	}

}
